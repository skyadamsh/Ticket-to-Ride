public class EuropeanGame extends Game
{
	private ArrayList<DestinationTicket> longRoutes;
	
	public EuropeanGame(Color[] plyrs)
	{
		super();
		City cadiz = new City("Cadiz");
		City lisboa = new City("Lisboa");
		City madrid = new City("Madrid");
		City barcelona = new City("Barcelona");
		City pamplona = new City("Pamplona");
		City brest = new City("Brest");
		City dieppe = new City("Dieppe");
		City london = new City("London");
		City edinburgh = new City("Edinburgh");
		City amsterdam = new City("Amsterdam");
		City bruxelles = new City("Bruxelles");
		City paris = new City("Paris");
		City marseille = new City("Marseille");
		City zurich = new City("Zurich");
		City essen = new City("Essen");
		City frankfurt = new City("Frankfurt");
		City munchen = new City("Munchen");
		City venezia = new City("Venezia");
		City roma = new City("Roma");
		City palermo = new City("Palermo");
		City berlin = new City("Berlin");
		City kobenhavn = new City("Kobenhavn");
		City wien = new City("Wien");
		City zagrab = new City("Zagrab");
		City brindisi = new City("Brindisi");
		City sarajevo = new City("Sarajevo");
		City budapest = new City("Budapest");
		City danzig = new City("Danzig");
		City stockholm = new City("Stockholm");
		City warszawa = new City("Warszawa");
		City sofia = new City("Sofia");
		City athina = new City("Athina");
		City smyrna = new City("Smyrna");
		City bucuresti = new City("Bucuresti");
		City wilno = new City("Wilno");
		City riga = new City("Riga");
		City kyiv = new City("Kyiv");
		City constantinople = new City("Constantinople");
		City angora = new City("Angora");
		City sevastopol = new City("Sevastopol");
		City smolensk = new City("Smolensk");
		City petrograd = new City("Petrograd");
		City moskva = new City("Moskva");
		City kharkov = new City("Kharkov");
		City rostov = new City("Rostov");
		City sochi = new City("Sochi");
		City erzurum = new City("Erzurum");
		City[] cities = {cadiz, lisboa, madrid, barcelona, pamplona, brest, dieppe, london, edinburgh, amsterdam, bruxelles, paris, 
			marseille, zurich, essen, frankfurt, munchen, venezia, roma, palermo, berlin, kobenhavn, wien, zagrab, brindisi, sarajevo, budapest, danzig, 
			stockholm, warszawa, sofia, athina, smyrna, bucuresti, wilno, riga, kyiv, constantinople, angora, sevastopol, smolensk, petrograd, moskva,
			kharkov, rostov, sochi, erzurum};
		setCities(cities);
		
		Route[] routes = {new Route(lisboa, cadiz, 2, Color.BLUE, false, 0), new Route(lisboa, madrid, 3, Color.PINK, false, 0),
			new Route(cadiz, madrid, 3, Color.ORANGE, false, 0), new Route(madrid, barcelona, 2, Color.YELLOW, false, 0),
			new Route(barcelona, pamplona, 2, Color.GREY, true, 0), new Route(madrid, pamplona, 3, Color.WHITE, true, 0),
			new Route(madrid pamplona, 3, Color.BLACK, true, 0), new Route(barcelona, marseille, 4, Color.GREY, false, 0),
			new Route(pamplona, marseille, 4, Color.RED, false, 0), new Route(pamplona, brest, 4, Color.PINK, false, 0),
			new Route(pamplona, paris, 4, Color.BLUE, false, 0), new Route(pamplona, paris, 4, Color.GREEN, false, 0),
			new Route(brest, paris, 3, Color.BLACK, false, 0), new Route(brest, dieppe, 2, Color.ORANGE, false, 0),
			new Route(dieppe, paris, 1, Color.PINK, false, 0), new Route(marseille, paris, 4, false, 0),
			new Route(dieppe, london, 2, Color.GREY, false, 1), new Route(dieppe, london, 2, Color.GREY, false, 1),
			new Route(london, edinburgh, 4, Color.BLACK, false, 0), new Route(london, edinburgh, 4, Color.ORANGE, false, 0),
			new Route(london, amsterdam, 2, Color.GREY, false, 2), new Route(dieppe, bruxelles, 2, Color.GREEN, false, 0),
			new Route(paris, bruxelles, 2, Color.YELLOW, false, 0), new Route(paris, bruxelles, 2, Color.RED, false, 0),
			new Route(bruxelles, amsterdam, 1, Color.BLACK, false, 0), new Route(amsterdam, essen, 3, Color.YELLOW, false, 0),
			new Route(amsterdam, frankfurt, 2, Color.WHITE, false, 0), new Route(bruxelles, frankfurt, 2, Color.BLUE, false, 0),
			new Route(paris, zurich, 3, Color.GREY, true, 0), new Route(marseille, zurich, 2, Color.PINK, true, 0),
			new Route(paris, frankfurt, 3, Color.WHITE, false, 0), new Route(paris, frankfurt, 3, Color.ORANGE, false, 0),
			new Route(essen, kobenhavn, 3, Color.GREY, false, 1), new Route(essen, kobenhavn, 3, Color.GREY, false, 1),
			new Route(frankfurt, essen, 2, Color.GREEN, false, 0), new Route(essen, berlin, 2, Color.BLUE, false, 0),
			new Route(frankfurt, berlin, 3, Color.BLACK, false, 0), new Route(frankfurt, berlin, 3, Color.RED, false, 0),
			new Route(frankfurt, munchen, 2, Color.PINK, false, 0), new Route(zurich, munchen, 2, Color.YELLOW, true, 0),
			new Route(zurich, venezia, 2, Color.GREEN, true, 0), new Route(marseille, roma, 4, Color.GREY, true, 0),
			new Route(roma, venezia, 2, Color.BLACK, false, 0), new Route(venezia, munchen, 2, Color.BLUE, true, 0),
			new Route(munchen, wien, 3, Color.ORANGE, false, 0), new Route(venezia, zagrab, 2, Color.GREY, false, 0),
			new Route(kobenhavn, stockholm, 3, Color.YELLOW, false, 0), new Route(kobenhavn, stockholm, 3, Color.WHITE, false, 0),
			new Route(berlin, danzig, 4, Color.GREY, false, 0), new Route(berlin, wien, 3, Color.GREEN, false, 0),
			new Route(berlin, warszawa, 4, Color.PINK, false, 0), new Route(berlin, warszawa, 4, Color.YELLOW, false, 0),
			new Route(wien, warszawa, 4, Color.BLUE, false, 0), new Route(wien, zagrab, 2, Color.GREY, false, 0),
			new Route(wien, budapest, 1, Color.RED, false, 0), new Route(wien, budapest, 1, Color.WHITE, false, 0),
			new Route(zagrab, budapest, 2, Color.ORANGE, false, 0), new Route(zagrab, sarajevo, 3, Color.RED, false, 0),
			new Route(roma, brindisi, 2, Color.WHITE, false, 0), new Route(roma, palermo, 4, Color.GREY, false, 1),
			new Route(palermo, brindisi, 3, Color.GREY, false, 1), new Route(palermo, smyrna, 6, Color.GREY, false, 2),
			new Route(brindisi, athina, 4, Color.GREY, false, 1), new Route(sarajevo, athina, 4, Color.GREEN, false, 0),
			new Route(sarajevo, sofia, 2, Color.GREY, true, 0), new Route(sarajevo, budapest, 3, Color.PINK, false, 0),
			new Route(budapest, bucuresti, 4, Color.GREY, true, 0), new Route(budapest, kyiv, 6, Color.GREY, true, 0),
			new Route(warszawa, kyiv, 4, Color.GREY, false, 0), new Route(warszawa, wilno, 3, Color.RED, false, 0),
			new Route(warszawa, danzig, 2, Color.GREY, false, 0), new Route(danzig, riga, 3, Color.BLACK, false, 0),
			new Route(stockholm, petrograd, 8, Color.GREY, true, 0), new Route(riga, petrograd, 4, Color.GREY, false, 0),
			new Route(riga, wilno, 4, Color.GREEN, false, 0), new Route(wilno, petrograd, 4, Color.BLUE, false, 0),
			new Route(wilno, smolensk, 3, Color.YELLOW, false, 0), new Route(wilno, kyiv, 2, Color.GREY, false, 0),
			new Route(kyiv, smolensk, 3, Color.RED, false, 0), new Route(kyiv, kharkov, 4, Color.GREY, false, 0),
			new Route(kyiv, bucuresti, 4, Color.GREY, false, 0), new Route(bucuresti, sevastopol, 4, Color.WHITE, false, 0),
			new Route(bucuresti, constantinople, 3, Color.YELLOW, false, 0), new Route(bucuresti, sofia, 2, Color.GREY, true, 0),
			new Route(sofia, constantinople, 3, Color.BLUE, false, 0), new Route(sofia, athina, 3, Color.PINK, false, 0),
			new Route(athina, smyrna, 2, Color.GREY, false, 1), new Route(smyrna, angora, 3, Color.ORANGE, true, 0),
			new Route(smyrna, constantinople, 2, Color.GREY, true, 0), new Route(constantinople, angora, 2, Color.GREY, true, 0),
			new Route(constantinople, sevastopol, 4, Color.GREY, false, 2), new Route(sevastopol, erzurum, 4, Color.GREY, false, 2),
			new Route(sevastopol, sochi, 2, Color.GREY, false, 1), new Route(sevastopol, rostov, 4, Color.GREY, false, 0),
			new Route(petrograd, moskva, 4, Color.WHITE, false, 0), new Route(smolensk, moskva, 2, Color.ORANGE, false, 0),
			new Route(moskva, kharkov, 4, Color.GREY, false, 0), new Route(kharkov, rostov, 2, Color.GREEN, false, 0),
			new Route(rostov, sochi, 2, Color.GREY, false, 0), new Route(sochi, erzurum, 3, color.RED, true, 0),
			new Route(erzurum, angora, 3, Color.BLACK, false, 0)};
		setRoutes(routes);
		
		//create regurlar destination tickets
		DestinationTicket[] tickets = {new DestinationTicket(berlin, roma, 9), new DestinationTicket(smolensk, rostov, 8),
			new DestinationTicket(kyiv, sochi, 8), new DestinationTicket(edinburgh, paris, 7), new DestinationTicket(angora, kharkov, 10),
			new DestinationTicket(warszawa, smolensk, 6), new DestinationTicket(london, wien, 10), new DestinationTicket(paris, wien, 8), 
			new DestinationTicket(london, berlin, 7), new DestinationTicket(essen, kyiv, 10), new DestinationTicket(budapest, sofia, 5),
			new DestinationTicket(bruxelles, danzig, 9), new DestinationTicket(riga, bucuresti,10), new DestinationTicket(frankfurt, kobenhavn, 5),
			new DestinationTicket(athina, wilno, 11), new DestinationTicket(brest, venezia, 8), new DestinationTicket(sofia, smyrna, 5),
			new DestinationTicket(zurich, brindisi, 6), new DestinationTicket(roma, smyrna, 8), new DestinationTicket(athina, angora, 5),
			new DestinationTicket(zurich, budapest, 6), new DestinationTicket(paris, zagrab, 7), new DestinationTicket(zagrab, brindisi, 6),
			new DestinationTicket(madrid, zurich, 8), new DestinationTicket(brest, marseille, 7), new DestinationTicket(berlin, bucuresti, 8),
			new DestinationTicket(berlin, moskva, 12), new DestinationTicket(marseille, essen, 8), new DestinationTicket(rostov, erzurum, 5),
			new DestinationTicket(palermo, constantinople, 8), new DestinationTicket(madrid, dieppe, 8), new DestinationTicket(stockholm, wien, 11),
			new DestinationTicket(venezia, constantinople, 10), new DestinationTicket(sarajevo, sevastopol, 8), new DestinationTicket(amsterdam, pamplona, 7),
			new DestinationTicket(barcelona, bruxelles, 8), new DestinationTicket(barcelona, munchen, 8), new DestinationTicket(kyiv, petrograd, 6),
			new DestinationTicket(frankfurt, smolensk, 13), new DestinationTicket(amsterdam, wilno, 12)};
		setDestinationTickets(tickets);
		
		//create long route destination tickets
		longRoutes = new ArrayList<DestinationTicket>(6);
		longRoutes.add(new DestinationTicket(cadiz, stockholm, 21));
		longRoutes.add(new DestinationTicket(kobenhavn, erzurum, 21));
		longRoutes.add(new DestinationTicket(brest, petrograd, 20));
		longRoutes.add(new DestinationTicket(palermo, moskva, 20));
		longRoutes.add(new DestinationTicket(lisboa, danzig, 20));
		longRoutes.add(new DestinationTicket(edinburgh, athina, 21));
			
		//create players
		createPlayers(plyrs);
		
		//give players 1 long route each
		Player[] players = getPlayers();
		for(int i = 0; i < players.length; i++)
		{
			int index = (int)(Math.random() * longRoutes.size());
			players[i].addDestinationTickets([longRoutes.remove(index)]);
		}
	}
}