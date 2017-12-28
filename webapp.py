import os
from flask import Flask, url_for, render_template, request
from flask import redirect
from flask import session

app = Flask(__name__)

# In order to use "sessions",you need a "secret key".
# This is something random you generate.  
# Just type some arbitrary letters and numbers.
# See: http://flask.pocoo.org/docs/0.10/quickstart/#sessions

app.secret_key=os.environ["SECRET_KEY"]; #This is an environment variable.  
                                     #The value should be set in Heroku (Settings->Config Vars).  
                                     #To run locally, set in env.sh and include that file in gitignore so the secret key is not made public.


usernames = []

@app.route('/')
def renderMain():
    return render_template('home.html')

@app.route('/startOver')
def startOver():
    usernames.remove(session['username'])
    session.clear() #clears variable values and creates a new session
    return redirect(url_for('renderMain')) # url_for('renderMain') could be replaced with '/'

@app.route('/startEurope')
def renderPage2():
    session["version"] = "Europe"
    return render_template('signin.html', version = "Europe")

@app.route('/chooseTeam',methods=['GET','POST'])
def renderPage3():
    if request.form['username'] not in usernames:
        usernames.append(request.form['username'])
        session["username"]=request.form['username']
        return render_template('chooseTeam.html')
    else:
        return render_template(signin, version=session["version"], error="That username is already being used.  Please choose a different one.")
    
if __name__=="__main__":
    app.run(debug=True,host="0.0.0.0",port=54321)