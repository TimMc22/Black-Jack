package models;

public class Deck {

	Card[] deck = new Card[52];
	int nextCardIndex;
	public Deck() {
	}
	public Card[] getDeck() {
		return deck;
	}
	public void setDeck(Card[] deck) {
		this.deck = deck;
	}
	public int getNextCardIndex() {
		return nextCardIndex;
	}
	public void setNextCardIndex(int nextCardIndex) {
		this.nextCardIndex = nextCardIndex;
	}
	
	public void shuffle() {
		
	}
	
	public void reinsertCards() {
		
	}
}
