package cardGame;

public class Application {

	public static void main(String[] args) {

		// Instantiate a Deck and two players
		Player player1 = new Player("John");
		Player player2 = new Player("Carol");
		Deck deck1 = new Deck();
		int cardsInDeck = 51; // counter to keep track of the top card in the deck as it is dealt.

		// call the initializeDeck and shuffle methods on the new deck
		deck1.initializeDeck();
		deck1.shuffle();

		// using the Draw method to add half the Deck to each players hand field
		for (int i = 1; i <= 52; i++) {
			if (i % 2 == 0) {
				cardsInDeck = player1.draw(deck1, cardsInDeck); // Draw method returns the number of cards left in the
																// deck
			} else {
				cardsInDeck = player2.draw(deck1, cardsInDeck);
			}
		}

		// show each players hand
		player1.describe();
		System.out.println();
		player2.describe();
		System.out.println();

		// play the war game by iterating through the hands 26 times and calling the
		// flip method for each player
		// then comparing the Value field of the flipped card in each players hand. the
		// incrementScore method is called for the winning player
		// if there is a tie then neither player gets a point
		for (int i = 0; i < 26; i++) {
			int player1Value = player1.flip().getValue();
			int player2Value = player2.flip().getValue();

			if (player1Value > player2Value) {
				player1.incrementScore(player1);
			} else if (player1Value < player2Value) {
				player2.incrementScore(player2);
			} // else a tie and no score added
		}

		// print out the final score and announce the winner
		System.out.println("The final score for " + player1.getName() + " is " + player1.getScore());
		System.out.println("The final score for " + player2.getName() + " is " + player2.getScore());
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " Wins!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName() + " Wins!");
		} else
			System.out.println("The game is a Draw");

	}

}
