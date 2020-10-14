public class Card {

	private int val;
	private Suit suit;
	private Color color;

	public Card(int n, Suit s){
		val = n;
		suit = s;
		if (suit.equals(Suit.SPADES) || suit.equals(Suit.CLUBS))
			setColor(Color.BLACK);
		else 
			setColor(Color.RED);
	}

	private void setColor(Color color) {
		this.color = color;
	}

	public Suit getSuit(){
		return suit;
	}
	public int getVal(){
		return val;
	}
	public Color getColor(){
		return color;
	}

	public String toString(){
		return(convert()+" of "+getSuit());
	}

	private String convert(){
		String name = "";
		switch (val) {
			case 1:
				name = "Ace";
				break;
			case 11:
				name = "Jack";
				break;
			case 12:
				name = "Queen";
				break;
			case 13:
				name = "King";
				break;
			default:
				name = Integer.toString(val);
				break;
		}
		return name;
	}

}
