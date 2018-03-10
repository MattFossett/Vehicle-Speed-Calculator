import java.util.Scanner;

public class MakeVehicle {
	public static double amtrakLength = 85.34;
	//t
	public static void main(String[] args) {
		
		System.out.println("Length in feet, seconds, mph");
		Scanner in = new Scanner(System.in);
		double lengthFeet = in.nextDouble();
		double seconds = in.nextDouble();
		//int mult = in.nextInt();
		double speed = in.nextDouble();
		long start = System.currentTimeMillis();
		Vehicle thing = new Vehicle(lengthFeet,seconds,speed);
		System.out.println(thing);
		System.out.println(System.currentTimeMillis() - start);
	}

}
