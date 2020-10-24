package cardGame;

import java.util.ArrayList;
import java.util.List;

//the player constructor
public class Player {

	private String name;
	private int score;
	public List<Card> hand = new ArrayList<Card>();

	public Player(String name) {
		this.name = name;
		this.setScore(0); // set the initial game score for each player to 0 using the setScore method
	}

	// prints out info about the player and calls the describe method for each card
	// in the Hand List
	public void describe() {

		System.out.println(name + " has the following hand:");
		for (Card currentHand : hand) { // enhanced for loop to print out the players hand
			currentHand.describe();
		}
	}

	// removes and returns the top card of the Hand
	public Card flip() {
		int topCard = hand.size() - 1; // top card in the Hand

		Card card = hand.get(topCard);
		hand.remove(topCard);
		return card;
	}

	// takes a Deck as an argument and calls the draw method on the deck, adding the
	// returned Card to the hand field.
	// method deincrements the number of cards left in the deck and returns this
	// value
	public int draw(Deck deck, int cardsInDeck) {
		hand.add(deck.draw(cardsInDeck));
		cardsInDeck -= 1;
		return cardsInDeck;
	}

	// adds 1 to the Player's score field
	public void incrementScore(Player player) {
		player.setScore(player.getScore() + 1);
	}

	// gets the players current score from the Player's score field
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
}
