package ua.com.foxminded.carmanager2;

import java.util.Objects;

public class Motorcycle {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Colour colour;
	String engineType;
	boolean isReadyToDrive;
	private int motoDistance = 0;

	public Motorcycle(String name, int yearOfProduction, int price, int weight, String colour, String engineType,
			boolean isReadyToDrive) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.colour = Colour.valueOf(colour.toUpperCase().replaceAll("[^a-z^A-Z]", ""));
		this.engineType = engineType;
		this.isReadyToDrive = isReadyToDrive;
	}

	public boolean repair() {
		return isReadyToDrive = true;
	}

	public boolean destroyEngine() {
		return isReadyToDrive = false;
	}

	protected void motoAddDistance(int additionalDistance) {
		if (additionalDistance > 0) {
			motoDistance += additionalDistance;
			isReadyToService();
			if (motoDistance > 200000)
				destroyEngine();
		} else
			throw new ArithmeticException("Distance should be more than 0 km !");
	}

	protected void motoAddDistance(double additionalDistance) {
		motoAddDistance((int) Math.round(additionalDistance));
	}

	public void repaint(String repaintColour) {
		this.colour = Colour.valueOf(repaintColour.toUpperCase().replaceAll("[^a-z^A-Z]", ""));
	}

	public boolean isReadyToService() {
		if (motoDistance > 8000) {
			return true;
		} else {
			return false;
		}
	}

	public int getMotoDistance() {
		return motoDistance;
	}

	@Override
	public String toString() {
		return "Motorcycle (Name = " + name + ", yearOfProduction = " + yearOfProduction + ", price = " + price
				+ ", weight = " + weight + ", color = " + colour.getNameColour() + ", engineType = " + engineType
				+ ", isReadyToDrive = " + isReadyToDrive + ", ODO = " + getMotoDistance() + ", Ready to Service? - "
				+ isReadyToService() + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(colour, isReadyToDrive, motoDistance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorcycle other = (Motorcycle) obj;
		return colour == other.colour && isReadyToDrive == other.isReadyToDrive && motoDistance == other.motoDistance;
	}

}
