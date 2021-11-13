package ua.com.foxminded.carmanager2;

public enum Colour {
	BLACK("Black"),

	ORANGE("Orange"),

	WHITE("White"),

	YELLOW("Yellow"),

	BLUE("Blue"),

	GREEN("Green");
	
	
	
	String nameColour;
	
	Colour(String nameColour) {
		this.nameColour = nameColour;
	}

	public String getNameColour() {
		return nameColour;
	}

	
	
}
