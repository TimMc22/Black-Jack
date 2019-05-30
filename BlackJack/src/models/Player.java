package models;

import java.util.ArrayList;

import enums.ChipsValues;

public class Player {

	private String name;
	// have it so every player starts with 100 chips
	private int chips = 100;
	private ChipsValues chipsValue = ChipsValues.BLACK;
	private ArrayList<Card> hand = new ArrayList<>();
	private int bet;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChips() {
		if (chips <= 0) {
			goBust();
			return 0;
		} else {
			return chips;
		}
	}

	public void setChips(int chips) {
		this.chips = chips;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

	public boolean goBust() {
		if (getChips() <= 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void placeBet(int bet) {

	}

	public Card hit() {
		Card card = new Card();
		card = Dealer.dealCard();
		return card;
	}

	public void stay(boolean stay) {
		if (stay) {
			// no card dealt
		} else {
			hit();
		}
	}

	public int getBet() {
		return bet;
	}

	public void setBet(int bet) {
		this.bet = bet;
	}

	public ChipsValues getHipsValues() {
		return chipsValue;
	}

	public void setHipsValues(ChipsValues chipsValue) {
		this.chipsValue = chipsValue;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName()).append("\n");
		sb.append("Chips Remaining: ").append(getChips());
		return sb.toString();
	}


}
