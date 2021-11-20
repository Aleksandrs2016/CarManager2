package ua.com.foxminded.carmanager2;

public class Car {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Colour colour;
	private int distance = 0;
	protected int distanceOnService = 0;
	protected boolean isReadyToService = false;

	public Car(String name, int yearOfProduction, int price, int weight, String colour) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.colour = Colour.valueOf(colour.toUpperCase().replaceAll("[^a-z^A-Z]", ""));
	}

	protected void addDistance(int additionalDistance) {
		if (additionalDistance > 0) {
			distance += additionalDistance;
			distanceOnService += additionalDistance;
			isReadyToService();
		} else
			throw new ArithmeticException("Distance should be more than 0 km !");
	}

	protected void addDistance(double additionalDistance) {
/*		if (additionalDistance > 0) {
			distance += additionalDistance;
			distanceOnService += additionalDistance;
			isReadyToService();
		} else
			throw new ArithmeticException("Distance should be more than 0 km !");
*/
		addDistance((int) Math.round(additionalDistance));
	}

	public boolean isReadyToService() {
		if (distanceOnService > 10000) {
			return true;
		} else {
			return false;
		}
	}

	public int getDistance() {
		return distance;
	}

	public int getDistanceOnService() {
		return distanceOnService;
	}

	@Override
	public String toString() {
		return "Car (Name = " + name + ", yearOfProduction = " + yearOfProduction + ", price = " + price + ", weight = "
				+ weight + ", colour = " + colour.getNameColour() + ", ODO = " + getDistance() + ", ODO on Service = "
				+ getDistanceOnService() + ", Ready to Service? - " + isReadyToService() + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + weight;
		result = prime * result + yearOfProduction;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (colour != other.colour)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (weight != other.weight)
			return false;
		if (yearOfProduction != other.yearOfProduction)
			return false;
		return true;
	}

}
