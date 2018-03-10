
public class Vehicle {
	private double length;
	private double seconds;
	private double speed;
	/**
	 * Takes parameters and makes a vehicle object. 
	 * INVARIANT: 
	 * Vehicle will solve for ONE of these parameters. 
	 * If any ONE of these is <0, it will be assigned to its correct value. 
	 * 
	 * @param lengthInFeet 
	 * @param seconds
	 * @param MPH
	 */
	public Vehicle(double lengthInFeet, double seconds,double MPH){
		if(lengthInFeet<0 && seconds<0 || seconds < 0 && MPH < 0 ||
				lengthInFeet < 0 && MPH < 0){
			throw new IllegalArgumentException("Invalid Parameters");
		}
		this.length = lengthInFeet;
		this.seconds = seconds;
		this.speed = MPH;
		if(this.length < 0){
			this.length = 5280*(speed*seconds/3600);
		} else if (this.seconds <0){
			this.seconds = (length/5280)*speed;
		} else if(this.speed <0){
			this.speed = (this.length/5280)/(this.seconds/3600);
		}
		
	}
	/**
	 * Returns String in format: "feet=x, seconds=y, MPH=z"
	 */
	public String toString(){
		return "feet=" + this.length + ", seconds=" + this.seconds + ", MPH=" + speed;
	}
	/**
	 * Takes length in feet and returns it as a mile. 
	 * @return
	 */
	public double toMile(){
		return this.length/5280;
	}
	/**
	 * @return length of class, in feet.
	 */
	public double getLength(){
		return this.length;
	}
	/**
	 * 
	 * @return seconds 
	 */
	public double getSeconds(){
		return this.seconds;
	}
	/**
	 * 
	 * @return speed in Miles Per Hour
	 */
	public double getSpeed(){
		return this.speed;
	}
}
