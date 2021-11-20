package ua.com.foxminded.carmanager2;

public class Buss extends Car {

	public Buss(String name, int yearOfProduction, int price, int weight, String colour) {
		super(name, yearOfProduction, price, weight, colour);
	}

	@Override
	public boolean isReadyToService() {
		if (distanceOnService > 50000) {
			return true;
		} else {
			return false;
		}
	}

}
