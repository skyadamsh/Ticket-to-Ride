public class City
{
	private String name;
	private Player stationOwner;
	
	public City(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	//returns true if no one has bought the station at this city yet, returns false otherwise
	public boolean buildStation(Player p)
	{
		if(stationOwner == null)
		{
			stationOwner = p;
			return true;
		}
		else
		{
			return false;
		}
	}
}