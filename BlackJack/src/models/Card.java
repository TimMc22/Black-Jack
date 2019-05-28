package models;

import enums.Rank;
import enums.Suit;

public class Card {

	private Suit suit;
	private Rank rank;
	private int nextCardCount;

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

	public int getNextCardCount() {
		return nextCardCount;
	}

	public void setNextCardCount(int nextCardCount) {
		this.nextCardCount = nextCardCount;
	}

	
}
