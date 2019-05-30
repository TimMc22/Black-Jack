package models;

import enums.Rank;
import enums.Suit;

public class Card {

	private Rank rank;
	private Suit suit;
	private int value = 0;

	private int cardValue;

	public Card() {
		setCardValue(0); 
	}

	public Card(int suit, int val) {
		setCardValue(val);
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

	public void setCardValue(int val) {
		cardValue = val;
	}

	public int getCardValue() {
		return cardValue;
	}

}
