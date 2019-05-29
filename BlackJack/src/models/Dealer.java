package models;

public class Dealer {

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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Dealer").append("\n");
		sb.append("Chips Remaining: ").append(chips);
		return sb.toString();
	}

}
