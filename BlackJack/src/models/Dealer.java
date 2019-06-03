package models;


public class Dealer {

	private Card[] hand = new Card[2];
	private int chips;
	
	
	public Dealer() {
		
	}

	public static Card[] dealHand() {
		Card[] hand = new Card[2];
		return hand;
	}

	public static Card dealCard() {
		Card card = new Card();
		return card;
	}

	public boolean goBust() {
		boolean isBust = false;
		return isBust;
	}

	public boolean getBlackJack() {
		boolean isBlackJack = false;
		return isBlackJack;
	}

	public Card[] getHand() {
		return hand;
	}

	public void setHand(Card[] hand) {
		this.hand = hand;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Dealer").append("\n");
		sb.append("Chips Remaining: ").append(chips);
		return sb.toString();
	}


}
