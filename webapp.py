import os
from flask import Flask, url_for, render_template, request, flash
from flask import redirect
from flask import session
from flask_oauthlib.client import OAuth

app = Flask(__name__)

app.debug = True #change to False for production

# In order to use "sessions",you need a "secret key".
# This is something random you generate.  
# Just type some arbitrary letters and numbers.
# See: http://flask.pocoo.org/docs/0.10/quickstart/#sessions

app.secret_key=os.environ["SECRET_KEY"]; #This is an environment variable.  

oauth = OAuth(app)

#Set up Github as OAuth provider
github = oauth.remote_app(
    'github',
    consumer_key=os.environ['GITHUB_CLIENT_ID'], #your web apps "username" for github OAuth
    consumer_secret=os.environ['GITHUB_CLIENT_SECRET'],#Password for github Oauth
    request_token_params={'scope': 'user:email'}, #request read-only access to the user's email.  For a list of possible scopes, see developer.github.com/apps/building-oauth-apps/scopes-for-oauth-apps
    base_url='https://api.github.com/',
    request_token_url=None,
    access_token_method='POST',
    access_token_url='https://github.com/login/oauth/access_token',  
    authorize_url='https://github.com/login/oauth/authorize' #URL for github's OAuth login
)


@app.context_processor
def inject_logged_in():
    return {"logged_in":('github_token' in session)}

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
    return github.authorize(callback=url_for('authorized', _external=True, _scheme='https'))
    #return render_template('signin.html', version = "Europe")
    
@app.route('/login/authorized')#the route should match the callback URL registered with the OAuth provider
def authorized():
    resp = github.authorized_response()
    if resp is None:
        session.clear()
        message = 'Access denied: reason=' + request.args['error'] + ' error=' + request.args['error_description'] + ' full=' + pprint.pformat(request.args)      
    else:
        try:
            #save user data and set log in message
            session['github_token']=(resp['access_token'],'')
            print(github.get('user').data)
            session['user_data']=github.get('user').data
            message="You were successfully logged in as " + session['user_data']['login']
        except:
            #clear the session and give error message
            session.clear()
            message='Unable to login. Please try again.'
    flash(message)
    return redirect(url_for('chooseTeam'))
  
@app.route('/logout')
def logout():
    session.clear()
    flash('You were logged out.')
    return redirect(url_for('renderMain'))

@app.route('/chooseTeam',methods=['GET','POST'])
def chooseTeam():
        #usernames.append(request.form['username']) #TODO: lock this or use a database
        return render_template('chooseTeam.html')
    
#automatically called to check who is logged in
@github.tokengetter
def get_github_oauth_token():
    return session.get('github_token')
    
if __name__=="__main__":
    app.run(debug=True)
