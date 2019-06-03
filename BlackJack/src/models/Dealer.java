package models;

import java.util.ArrayList;

public class Dealer extends Card {

	private Card[] hand = new Card[2];

	private int chips;

	public Dealer() {

	}

	public Dealer(int chips) {
		this.chips = chips;
	}

	public static Card[] dealHand() {
		Card[] hand = new Card[2];
		return hand;
	}

	public static Card dealCard() {
		Card card = new Card();
		return card;
	}

	// need to populate
	public ArrayList<Card> getHand() {

		return null;
	}

	public void setHand(Card[] hand) {
		this.hand = hand;
	}

	public boolean goBust() {
		boolean isBust = false;
		return isBust;
	}

	public boolean getBlackJack() {
		boolean isBlackJack = false;
		return isBlackJack;

	}

}
