package ua.com.foxminded.carmanager2;

public class PassengerCar extends Car {

	public PassengerCar(String name, int yearOfProduction, int price, int weight, String colour) {
		super(name, yearOfProduction, price, weight, colour);

	}

	@Override
	public boolean isReadyToService() {
		if (distanceOnService > 10000) {
			return true;
		} else {
			return false;
		}
	}

}
