package JavaWeek6;
/*
Player
i.     Fields
    1.     hand (List of Card)
    2.     score (set to 0 in the constructor)
    3.     name

ii.    Methods
     1.     describe (prints out information about the player and calls the describe method for each card in the Hand List)
     2.     flip (removes and returns the top card of the Hand)
     3.     draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
     4.     incrementScore (adds 1 to the Player’s score field)
 */

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hands = new ArrayList<Card>();
	int score;
	String playerName;
	
	Player(String name){
		this.playerName = name;
		this.score = 0;
	}
	
	public List<Card> getHands() {
		return hands;
	}
	public void setHands(List<Card> hands) {
		this.hands = hands;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	//1. describe (prints out information about the player and calls the describe method for each card in the Hand List)
	public void describe() {
		System.out.println(this.playerName + " has score: " + this.score);
		for(Card hand : hands) {
			hand.describe();
		}
	}
	 //2. flip (removes and returns the top card of the Hand)
	public Card flip() {
		//System.out.println(this.playerName + " has score: " + this.score);
		Card flippedCard = this.hands.remove(0);
		return flippedCard;
	}
	
	//3. draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
		this.hands.add(drawnCard);
	}
		
	//4. incrementScore (adds 1 to the Player’s score field)
	public void incrementScore() {
		this.score++;
		//System.out.println("After increment " + this.playerName + " has score: " + this.score);		
	}	
	
}
