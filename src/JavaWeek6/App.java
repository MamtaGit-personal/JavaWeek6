package JavaWeek6;

public class App {
	
	/* Create a class called App with a main method.

		a.      Instantiate a Deck and two Players, call the shuffle method on the deck.
		
		b.      Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
		
		c.      Using a traditional for loop, iterate 26 times and call the flip method for each player.
				Compare the value of each card returned by the two player’s flip methods. Call the incrementScore 
				method on the player whose card has the higher value.  Print a message to say which player received a point.
				Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
				
		d.      After the loop, compare the final score from each player.
		
		e.      Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
	 */
	
	public static void main(String[] args) {
		
		//a. Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck deck = new Deck();
				
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		deck.shuffle();
		//deck.describe();
		
		distributeCardsBetweenTwoPlayers(deck, player1, player2);
				
		playFlipGameToCompareTwoPlayersScore(player1, player2);
		
		compareFinalScoreOfTwoPlayersAndPrintResult(player1, player2);
		
	}// main ()
	
	//b. Using a traditional for loop, iterate 52 times calling the Draw method on the other player each 
	//iteration using the Deck you instantiated.
	public static void distributeCardsBetweenTwoPlayers(Deck deck, Player player1, Player player2) {
		for(int i = 1; i <= 52; i++) {
			Card drawnCard = deck.draw();
			if(i % 2 == 0) {
				player2.hands.add(drawnCard);			
			}
			else player1.hands.add(drawnCard);
				
		}// for()		
	}
		
	//c. Using a traditional for loop, iterate 26 times and call the flip method for each player.
	//Compare the value of each card returned by the two player’s flip methods. Call the incrementScore 
	//method on the player whose card has the higher value.  Print a message to say which player received a point.
	//Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
	public static void playFlipGameToCompareTwoPlayersScore(Player player1, Player player2) {
		
		for(int i = 0; i < 26; i++) {
			
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			if(player1Card.cardValue == player2Card.cardValue)
				System.out.println("No point was awarded.");
			
			else if(player1Card.cardValue > player2Card.cardValue) {
				player1.incrementScore();
				System.out.println("Player 1 was awarded one point");
			} 
			
			else {
				player2.incrementScore();
				System.out.println("Player 2 was awarded one point");
			}
			
		}// for()
	}
	
	//d. Compare the final score from each player and print result. 
	public static void compareFinalScoreOfTwoPlayersAndPrintResult(Player player1, Player player2) {
		if(player1.score > player2.score) {
			
			System.out.println(player1.playerName + " WON the game.");
			System.out.println(player1.playerName + "'s score is:" + player1.score + " and " + player2.playerName + "'s score is:" + player2.score);
		}
		else if(player2.score > player1.score) {
			
			System.out.println(player2.playerName + " WON the game.");
			System.out.println(player1.playerName + "'s score is:" + player1.score + " and " + player2.playerName + "'s score is:" + player2.score);
		}
		else {
			
			System.out.println("Draw - both players had the same score.");
			System.out.println(player1.playerName + "'s score is:" + player1.score + " and " + player2.playerName + "'s score is:" + player2.score);
		}
	}
	
}
