package ua.com.foxminded.carmanager2;

public abstract class AgroculturMachinery implements Serviceable {

	String name;
	int yearOfProduction;
	int price;
	AgriculturMachineryType type;
	protected int usageMeter = 0;
	protected int usageMeterOnService = 0;
	protected boolean isReadyToService = false;

	public AgroculturMachinery(String name, int yearOfProduction, int price, String type, int usageMeter,
			boolean isReadyToService) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.type = AgriculturMachineryType.valueOf(type.replaceAll("[^a-z^A-Z]", "").toUpperCase());
		this.usageMeter = usageMeter;
		usageMeterOnService = usageMeter;
		this.isReadyToService = isReadyToService;
	}

	public void addDistance(int additionalUsage) {
		if (additionalUsage > 0) {
			usageMeter += additionalUsage;
			usageMeterOnService += additionalUsage;
		} else {
			throw new ArithmeticException("Must be positive value");
		}
	}

	public void addDistance(double additionalUsage) {
		addDistance((int)Math.round(additionalUsage));

	}

	public void services() {
		usageMeterOnService = 0;

	}

	public int getUsageMeter() {
		return usageMeter;
	}

	public int getUsageMeterOnService() {
		return usageMeterOnService;
	}

	public int getDistance() {
		return 0;
	}

	public int getDistanceOnService() {
		return 0;
	}

	@Override
	public String toString() {
		return "AgroculturMachinery [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price
				+ ", type=" + type.name().toLowerCase() + ", usageMeter=" + usageMeter + ", usageMeterOnService="
				+ usageMeterOnService + ", isReadyToService=" + isReadyToService + "]";
	}

}
