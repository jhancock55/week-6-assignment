package cardGame;

public class Card {

	private int value;
	private int name;

	// the card constructor
	public Card(Integer name, Integer value) {
		this.name = name;
		this.value = value;
	}

	// the describe method for displaying a card
	public void describe() {
		String valueName = null;
		String nameName = null;
		switch (value) {
		case 2:
			valueName = "two";
			break;
		case 3:
			valueName = "three";
			break;
		case 4:
			valueName = "four";
			break;
		case 5:
			valueName = "five";
			break;
		case 6:
			valueName = "six";
			break;
		case 7:
			valueName = "seven";
			break;
		case 8:
			valueName = "eight";
			break;
		case 9:
			valueName = "nine";
			break;
		case 10:
			valueName = "ten";
			break;
		case 11:
			valueName = "jack";
			break;
		case 12:
			valueName = "queen";
			break;
		case 13:
			valueName = "king";
			break;
		case 14:
			valueName = "ace";
			break;
		}
		switch (name) {
		case 0:
			nameName = "spades";
			break;
		case 1:
			nameName = "hearts";
			break;
		case 2:
			nameName = "clubs";
			break;
		case 3:
			nameName = "dimonds";
			break;
		}
		System.out.println(valueName + " of " + nameName);
	}

	// getters and setters for the card constructor
	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
