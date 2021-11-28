import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Car car = null;
		String color, engineType, regNo;
		int maxSpeed, maxGear, totalSeats, choice;

		System.out.println("Color : ");
		color = in.nextLine();
		System.out.println("Engine Type : ");
		engineType = in.nextLine();
		System.out.println("Highest Speed : ");
		maxSpeed = in.nextInt();
		
		System.out.println("Total Gears : ");
		maxGear = in.nextInt();
		
		System.out.println("Number of Seats : ");
		totalSeats = in.nextInt();
		
		car = new Car(color, engineType, maxGear,maxSpeed,  totalSeats);
		
		System.out.println("Register Number : ");
		regNo = in.nextLine();
		regNo = in.nextLine();
		car.setRegNo(regNo);
		System.out.println("Want to switch on[Yes/No]?");
		String result = in.next();
		if (result.equalsIgnoreCase("YES")) {
		car.setPower(true);
		do {
			System.out.println("1. Speed Up..");
			System.out.println("2. Speed Down..");   
			System.out.println("3. Gear Up..");
			System.out.println("4. Gear Down..");
			System.out.println("5. Current Speed ");
			System.out.println("6. Current Gear..");
			System.out.println("7. Apply Brake");
			System.out.println("8. Start...");
			System.out.println("9. Stop...");
			System.out.println("10. Exit..");
			System.out.println("Enter your choice : ");
			choice = in.nextInt();
			switch(choice) {
			case 1:
				car.accelerate();
				System.out.println("Speed : " + car.getSpeed());
				System.out.println("Gear  : " + car.getGear());				
				break;
			case 2:
				car.decelerate();
				System.out.println("Speed : " + car.getSpeed());
				System.out.println("Gear  : " + car.getGear());				
				break;
			case 3:
				car.gearUp();
				System.out.println("Gear  : " + car.getGear());				
				break;
			case 4:
				car.gearDown();
				System.out.println("Gear  : " + car.getGear());				
				break;
			case 5:
				System.out.println("Speed  : " + car.getSpeed());
				break;
			case 6:
				System.out.println("Gear  : " + car.getGear());
				break;
			case 7:
				car.applyBrake();
				break;
			case 8:
				car.setPower(true);
				break;
			case 9:
				car.setPower(false);			
			}
		}while (choice != 10);
		}
		car.setPower(false);
	}
}