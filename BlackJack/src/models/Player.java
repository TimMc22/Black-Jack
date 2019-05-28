package models;

import java.util.ArrayList;

public class Player {

	private String name;
	//have it so every player starts with 100 chips
	private int chips = 100;
	private ArrayList<Card> hand = new ArrayList<>();

	
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
		if(chips <= 0) {
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
		boolean isBust = false;
		return isBust;
	}

	public int placeBet() {
		int bet = 0;
		return bet;
	}
	
	public Card hit() {
		Card card = new Card();
		card = Dealer.dealCard();
		return card;
	}
	
	public void stay(boolean stay) {
		if(stay) {
			//no card dealt
		} else {
			hit();
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName()).append("\n");
		sb.append("Chips Remaining: ").append(getChips());
		return sb.toString();
	}
	
	
}
