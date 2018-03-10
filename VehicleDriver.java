import java.util.Scanner;
/**
Author: Matt Fossett
Description: Driver for Vehicle.java;
Shows simple creation of vehicle object from user input. 

Version 2.0 
3/19/2018
 */
public class VehicleDriver {
	
	public static void main(String[] args ){
	    Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            //1 of these may be -1, which will then construct to its actual value.
            double lengthInFeet = in.nextDouble();
            double seconds = in.nextDouble();
            double mph = in.nextDouble();

            Vehicle userVehicle = new Vehicle(lengthInFeet, seconds, mph);
            System.out.println(userVehicle);
        }
	}
}