public Route
{
	private City start;
	private City end;
	private int length;
	private Color color;
	private boolean tunnel;
	private int locomotivesRequired;
	private Player owner;
	
	public Route(City s, City e, int l, Color c, boolean t, int locsRequired)
	{
		start = s;
		end = e;
		length = l;
		color = c;
		tunnel = t;
		locomotivesRequired = locsRequired;
	}
}