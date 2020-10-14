import java.util.ArrayList;
import java.util.Random;

public class Deck{
	private int numCards;
	private boolean shuffled;
	ArrayList<Card> cards;
	ArrayList<Card> discard;


	public Deck(){
		numCards = 0;
		shuffled = false;
		cards = new ArrayList<Card>();
		discard = new ArrayList<Card>();
		create();
	}

	private void create(){
		for (int n=1; n<=13; n++) {
			for (int s=0; s<4; s++) {
				cards.add(new Card(n, Suit.values()[s]));
			}
			
		}
		setSize();
	}

	public void deal(){
		System.out.println(cards.get(0).toString());
		discard();
	}

	public void shuffle(){
		ArrayList<Card> temp = new ArrayList<Card>();
		int i = 0;
		Random rand = new Random();
		while(numCards>0){
			i = rand.nextInt(numCards);
			temp.add(cards.remove(i));
			numCards--;
		}
		cards = temp;
		setSize();
		shuffled = true;
	}

	private void setSize(){
		numCards = cards.size();
	}

	public ArrayList<Card> getDeck(){
		return cards;
	}

	public void discard(){
		discard.add(cards.remove(0));
	}

	public boolean getShuffled(){
		return shuffled;
	}
}