package models;

import enums.Rank;
import enums.Suit;

public class Card {

	private Suit suit;
	private Rank rank;
	private Face face;

	public Card() {
			}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
}
