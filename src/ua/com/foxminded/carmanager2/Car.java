package ua.com.foxminded.carmanager2;

public class Car {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Colour colour;

	public Car(String name, int yearOfProduction, int price, int weight, String colour) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.colour = Colour.valueOf(colour.toUpperCase().replaceAll("[^a-z^A-Z]", ""));
	}

	@Override
	public String toString() {
		return "Car (Name = " + name + ", yearOfProduction = " + yearOfProduction + ", price = " + price + ", weight = "
				+ weight + ", colour = " + colour.nameColour + ")";
	}
	
	

}
