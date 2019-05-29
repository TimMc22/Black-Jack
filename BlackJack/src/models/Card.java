package models;

import enums.Face;

public class Card {

	private Face face;

	private int cardValue;

	public Card() {
		setCardValue(0);
	}

	public Card(int suit, int val) {
		setCardValue(val);
	}

	public Face getFace() {
		return face;
	}

	public void setFace(Face face) {
		this.face = face;
	}

	public void setCardValue(int val) {
		cardValue = val;
	}

	public int getCardValue() {
		return cardValue;
	}

}
