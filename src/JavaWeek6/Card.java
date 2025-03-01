package JavaWeek6;

/*
Card
   i.	Fields
        1.     value (contains a value from 2-14 representing cards 2-Ace)
        2.     name (e.g. Ace of Diamonds, or Two of Hearts)
        
   ii. Methods
        1.     Getters and Setters
        2.     describe (prints out information about a card)
* */

public class Card {
		
	int cardValue;  //contains a value from 2-14 representing cards 2-Ace
	String cardSuit; // Ace, Hearts, Spades and Diamonds
	String cardName; //Ace of Diamonds, or Two of Hearts
	
	
	public Card() {}
	
	public Card(String cardName, String cardSuit, int cardValue ){
		this.cardName = cardName;
		this.cardSuit = cardSuit;
		this.cardValue = cardValue;
	}
	
	public String getCardSuit() {
		return cardSuit;
	}

	public void setCardSuit(String cardSuit) {
		this.cardSuit = cardSuit;
	}

	public int getCardValue() {
		return cardValue;
	}

	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	// 2. describe (prints out information about a card)
	public void describe() {
		System.out.println(this.cardName + " of " + this.cardSuit + " ----- " + this.cardValue);
		
	}

}
