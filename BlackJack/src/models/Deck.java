package models;

import java.util.Random;

public class Deck {

	Card[] deck = new Card[52];
	int nextCardIndex;
	public Random rng = new Random();

	public Deck() {
		int index = 0;
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
			Card a = new Card();
			 deck[index] = a;
			 index++;
			}
		}
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
		nextCardIndex++;
		if (nextCardIndex > 52) {
			shuffle();
			nextCardIndex = 0;
		}
	}

	public void shuffle() {
		for (int i = 0; i < deck.length; i++) {
			int j = rng.nextInt(52) + 1;
			Card filler = deck[i];
			deck[i] = deck[j];
			deck[j] = filler;
		}
	}

	public Card reinsertCards() {
		for(int i = 52; i < deck.length; i--) {
			if(i == 0) {
				return deck[52];
			}
		}
		return null;
		
	}
}
