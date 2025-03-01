package JavaWeek6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Deck
i. Fields
       1. cards (List of Card)

ii.    Methods
       1.     shuffle (randomizes the order of the cards)
       2.     draw (removes and returns the top card of the Cards field)
       3.     In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
*/
public class Deck {
	List<Card> cards = new ArrayList<Card>();
	
	//3. In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
	Deck(){
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		String[] cardNames = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine","Ten", "Jack", "Queen", "King", "Ace"};
		
		for(String suit : suits) {
			int count = 2;
			for(String cardName : cardNames) {
				Card card = new Card(cardName, suit, count);
				this.cards.add(card);
				count ++;
			}
		}// for loop
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	//1. shuffle (randomizes the order of the cards)
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	// 2. draw (removes and returns the top card of the Cards field)
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}

	public void describe() {
		for(Card card : cards) {
			card.describe();
		}
	}
	
}
