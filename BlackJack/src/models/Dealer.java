package models;


public class Dealer {


	private int chips;

	public Dealer(int chips) {
		this.chips = chips;
	}

	public Card[] dealHand() {
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Dealer").append("\n");
		sb.append("Chips Remaining: ").append(chips);
		return sb.toString();
	}



}
