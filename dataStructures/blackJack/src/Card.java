public class Card {

	private int val;
	private Suit suit;

	public Card(int n, Suit s){
		val = n;
		suit = s;
	}


	public Suit getSuit(){
		return suit;
	}
	public int getVal(){
		return val;
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
