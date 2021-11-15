package ua.com.foxminded.carmanager2;

public enum Colour {
	BLACK("Black"),

	ORANGE("Orange"),

	WHITE("White"),

	YELLOW("Yellow"),

	BLUE("Blue"),

	GREEN("Green");

	private String nameColour;

	Colour(String nameColourString) {
		this.nameColour = nameColourString;
	}

	public String getNameColour() {
		return nameColour;
	}

}
