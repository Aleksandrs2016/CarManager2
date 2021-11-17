package ua.com.foxminded.carmanager2;

import java.util.Scanner;

public class CarManager {

	public static void main(String[] args) {

		Car prius = new Car("Toyota Prius", 2008, 15000, 1200, "    GrEEn  !!");
		Car renault = new Car("Renault Laguna", 2000, 9700, 1600, "WHITE");
		Car renault1 = new Car("Renault Laguna", 2000, 9700, 1600, "WHITE");

		prius.addDistance(1000);

		Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16000, 600, " black", "Disel", true);
		Motorcycle yamaha = new Motorcycle("Yamaha  FZ1", 2007, 9000, 700, "orangE ", "Gas", false);

//		System.out.println(prius);
//		System.out.println(renault);
//		System.out.println(renault1);

//		System.out.println("");
		
		suzuki.motoAddDistance(250000);
		yamaha.motoAddDistance(250000);

		System.out.println(suzuki);
		System.out.println(yamaha);

		yamaha.repair();
		suzuki.repair();

		Scanner x = new Scanner(System.in);
		System.out.print("Choose colour to paint: ");
		Colour[] colours = Colour.values();
		for (Colour s : colours) {
			System.out.print(s + "/ ");
		}
		System.out.println("");
		String source = x.nextLine();
		System.out.println("");
		System.out.println("You`ve chosen: " + "\"" + source + "\".");
		System.out.println("");
		x.close();
		
		yamaha.repaint(source);
		

		System.out.println("");
		System.out.println("After repair service");
		System.out.println("");

		System.out.println(suzuki);
		System.out.println(yamaha);

		System.out.println("");

//		System.out.println("Renault1 = Prius? - " + renault1.equals(prius));
//		System.out.println("Renault1 = Renault? - " + renault1.equals(renault));
		System.out.println("Yamaha FZ1 = Suzuki GSX-R1000? - " + yamaha.equals(suzuki));

	}

}
