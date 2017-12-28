import java.util.ArrayList;

public class Game
{
	private Player[] players;
	private City[] cities;
	private Route[] routes;
	private ArrayList<TrainCard> trainCards;
	private ArrayList<DestinationTicket> destinationTickets;
	
	public Game()
	{
		//create train cards
		trainCards = new ArrayList<TrainCard>(110);
		Color[] colors = [Color.PINK, Color.WHITE, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.BLACK, Color.RED, Color.GREEN]
		//Create 12 cards of each color
		for(int i = 0; i < colors.length; i++)
		{
			for(int j = 0; j < 12; j++)
			{
				trainCards.add(i * 12 + j, new TrainCard(colors[i]));
			}
		}
		//Create 14 locomotives, which have no color (null)
		for(int i = 95; i < 110; i++)
		{
			trainCards.add(i, new TrainCard(null));
		}
	}
	
	public Player[] getPlayers()
	{
		return players;
	}
	
	public void setCities(City[] cts)
	{
		cities = new City[cts.length];
		for(int i = 0; i < cts.length; i++)
		{
			cities[i] = cts[i];
		}
	}
	
	public void setRoutes(Route[] rts)
	{
		routes = new Route[rts.length];
		for(int i = 0; i < rts.length; i ++)
		{
			routes[i] = rts[i];
		}
	}
	
	public void setDestinationTickets(DestinationTicket[] destinations)
	{
		destinationTickets = new ArrayList<DestinationTicket>(destinations.length);
		for(int i = 0; i < destinations.length; i++)
		{
			destinationTickets.add(destinations[i]);
		}
	}
	
	public void createPlayers(Player[] plyrs)
	{
		players = new Player[plyrs.length];
		for(int i = 0; i < plyrs.length; i++)
		{
			//each player gets 4 train cards
			TrainCard[] cards = new TrainCard[4];
			for(int i = 0; i < 4; i++)
			{
				int index = (int)(Math.random() * trainCards.size());
				cards[i] = trainCards.remove(index);
			}
			//each player gets 3 destination tickets
			DestinationTicket[] tickets = new DestinationTicket[3];
			for(int i = 0; i < 3; i++)
			{
				int index = (int)(Math.random() * destinationTickets.size());
				tickets[i] = destinationTickets.remove(index);
			}
			players[i] = new Player(plyrs[i], cards, tickets, 45, 0)
		}
	}
}