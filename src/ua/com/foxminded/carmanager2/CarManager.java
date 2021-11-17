package ua.com.foxminded.carmanager2;

public class CarManager {

	public static void main(String[] args) {

		Car prius = new Car("Toyota Prius", 2008, 15000, 1200, "    GrEEn  !!");
		Car renault = new Car("Renault Laguna", 2000, 9700, 1600, "WHITE");
		Car renault1 = new Car("Renault Laguna", 2000, 9700, 1600, "WHITE");
		
		prius.AddDistance(1000);
		
		Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16000, 600, " black", "Disel", true);
		Motorcycle yamaha = new Motorcycle("Yamaha  FZ1", 2007, 9000, 700, "orangE ", "Gas", false);
		
		System.out.println(prius);
		System.out.println(renault);
		System.out.println(renault1);
		
		System.out.println("");
		
		System.out.println(suzuki);
		System.out.println(yamaha);
		
		System.out.println("");
		
		System.out.println("Renault1 = Prius? - " + renault1.equals(prius));
		System.out.println("Renault1 = Renault? - " + renault1.equals(renault));
		System.out.println("Yamaha FZ1 = Suzuki GSX-R1000? - " + yamaha.equals(suzuki));

	}

}
