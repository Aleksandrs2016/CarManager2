package ua.com.foxminded.carmanager2;

public class CarManager {

	public static void main(String[] args) {

		Car prius = new Car("Toyota Prius", 2008, 15000, 1200, "Green");
		Car renault = new Car("Renault Laguna", 2000, 9700, 1600, "White");
		
		Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16000, 600, "Black", "Disel", true);
		Motorcycle yamaha = new Motorcycle("Yamaha  FZ1", 2007, 9000, 700, "Orange", "Gas", false);
		
		System.out.println(prius);
		System.out.println(renault);
		
		System.out.println(suzuki);
		System.out.println(yamaha);

	}

}
