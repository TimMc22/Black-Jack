package models;

import enums.Face;
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

	public Face getFace() {
		return face;
	}

	public void setFace(Face face) {
		this.face = face;
	}

}
