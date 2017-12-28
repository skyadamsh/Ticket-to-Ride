public class Player
{
	private Color color;
	private ArrayList<TrainCard> trainCards;
	private ArrayList<DestinationTicket> destinationTickets;
	private int unplayedTrains;
	private int unplayedStations;
	
	public Player(Color c, TrainCard[] tcs, DestinationTicket[] dts, int trains, int stations)
	{
		color = c;
		trainCards = new ArrayList<TrainCard>(tcs.size());
		destinationTickets = new ArrayList<DestinationTicket>(dts.size());
		unplayedTrains = trains;
		unplayedStations = stations;
		
		for(int i = 0; i < tcs.length; i ++)
		{
			trainCards.add(tcs[i]);
		}
		
		for(int i = 0; i < dts.length; i ++)
		{
			destinationTickets.add(dts[i]);
		}
	}
	
	public addDestinationTickets(DestinationTicket[] tickets)
	{
		for(int i = 0; i < tickets.length; i++)
		{
			destinationTickets.add(tickets[i]);
		}
	}
}