package models;

import java.util.ArrayList;

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

	//need to populate
	public ArrayList<Card> getHand() {
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Dealer").append("\n");
		sb.append("Chips Remaining: ").append(chips);
		return sb.toString();
	}


}
