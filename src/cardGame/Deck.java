package cardGame;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private List<Card> cards = new ArrayList<Card>();

	// Initialize deck by using 0 to 3 for the suit and 2 to 14 for the card value
	public void initializeDeck() {

		for (int i = 0; i < 4; i++) { // card suit
			for (int j = 2; j <= 14; j++) { // card value 2 through ace
				cards.add(new Card(i, j));
			}

		}
	}

	// This method shuffles the deck by swapping two random cards in the deck 1,000
	// times
	public void shuffle() {

		int card1, card2;

		for (int k = 0; k < 1000; k++) {

			card1 = (int) (52 * Math.random());
			card2 = (int) (52 * Math.random());

			Card tmpCard = cards.get(card1);
			cards.set(card1, cards.get(card2));
			cards.set(card2, tmpCard);
		}
	}

	// this method returns a card by getting the card in the deck at the location
	// passed to the method
	public Card draw(int numCardsLeft) {

		return (cards.get(numCardsLeft));
	}
}
