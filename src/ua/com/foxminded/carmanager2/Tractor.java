package ua.com.foxminded.carmanager2;

public class Tractor extends AgroculturMachinery {

	public Tractor(String name, int yearOfProduction, int price, String type, int usageMeter,
			boolean isReadyToService) {
		super(name, yearOfProduction, price, type, usageMeter, isReadyToService);
	}

	@Override
	public boolean isReadyToService() {
		if (usageMeterOnService > 1000) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "Tractor [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", type="
				+ type.name().toLowerCase() + ", usageMeter=" + usageMeter + " km, usageMeterOnService="
				+ usageMeterOnService + " km, isReadyToService=" + isReadyToService() + "]";
	}

}
