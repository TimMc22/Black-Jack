package models;

import enums.Rank;
import enums.Suit;

public class Card {

	private Rank rank;
	private Suit suit;
	private int value = 0;

	public Card() {
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void checkAceValue() {
		
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
}
