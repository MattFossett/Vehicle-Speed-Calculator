 import java.util.Scanner;

public class Speed {
	
	public static double amtrak = 85.34;
	public static double septa = 85;
	
	public static void main(String[] args ){
		Vehicle sec = new Vehicle(5280,-1,60);
		Vehicle leng = new Vehicle(-1,3600,10);
		Vehicle test = new Vehicle(-1,5,11.637272727272727);
		System.out.println(test.toString());
		greeting();
		Scanner in = new Scanner(System.in);
		
		double seconds = getSeconds();
		double length = getLength();
		Vehicle train = new Vehicle(length,seconds,-1);
	
	}
	public static void greeting(){
		System.out.println("Speed Find is a program that takes data\n "
				+ "that you input from a video. Follow the directions.");
	}
	public static double getSeconds(){
		System.out.println("\n\nPick 2 points that you will later be able to \n"
				+ "find the measure of. \n\nEX length of train car, or front to back bumper of car.");
		System.out.println("How many seconds did it take to get from those 2 points?");
		Scanner in = new Scanner(System.in);
		double ret = in.nextDouble();
		
		return ret+.0;
	}
	public static double getLength(){
		
		System.out.println("Is the length an (1)Amtrak, (2)Septa, or (3)Custom length?");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		if(choice==3){
			System.out.println("Please enter your custom measurement in feet.");
			double x = in.nextDouble();
			return x;
		} else{
			System.out.println("How many of those?");
			int ret = in.nextInt();
			if(choice == 1){	
				return ret*amtrak;
			} else {
				return ret*septa;
			}
		}
		
		
	}
	public static double getSpeed(Double t, Double l){
		double mile = l/5280;
		double time = t/3600;
		return mile/time;
	}
}
