package ua.com.foxminded.carmanager2;

public class Combine extends AgroculturMachinery {

	public Combine(String name, int yearOfProduction, int price, String type, int usageMeter,
			boolean isReadyToService) {
		super(name, yearOfProduction, price, type, usageMeter, isReadyToService);
	}

	@Override
	public boolean isReadyToService() {
		if (usageMeterOnService > 30) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Tractor [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", type="
				+ type.name().toLowerCase() + ", usageMeter=" + usageMeter + " hours, usageMeterOnService="
				+ usageMeterOnService + " hours, isReadyToService=" + isReadyToService() + "]";
	}
}