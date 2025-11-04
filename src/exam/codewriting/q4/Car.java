package exam.codewriting.q4;

/*
 * We wish to create a Car class. A Car has-a(n):
 * 
 * Odometer, which tracks how many miles the car has been driven.
 * Fuel efficiency, typically given as miles-per-gallon.
 * Fuel tank, which can hold some amount of fuel, in gallons.
 * Current amount of fuel.
 */

public class Car {

	// Declare your instance variables here:
	private double milesDriven;
	private double milesPerGallon;
	private double maxFuel;
	private double currentFuel;
	
	// Write the constructor for the Car class:
	// (For full credit the constructor should use only two parameters)
	public Car (double milesPerGallon, double maxFuel){
		this.milesPerGallon = milesPerGallon;
		this.maxFuel = maxFuel;
		this.milesDriven = 0;
		this.currentFuel = maxFuel;
	}
	
	/**
	* Drives the car at the given speed for the given amount of time or until out of fuel.
	* (Hint: Carefully consider the impact of driving to all instance variables).
	*/
	public void drive ( double milesPerHour , double hours ) {
		double milesMaybeDriven = milesPerHour * hours;
		if (this.currentFuel < ((1 / this.milesPerGallon) * milesMaybeDriven)){
			this.milesDriven = this.milesDriven + (this.currentFuel * this.milesPerGallon);
			this.currentFuel = 0;
		} else {
			this.milesDriven = this.milesDriven + milesMaybeDriven;
			this.currentFuel = this.currentFuel - ((1 / this.milesPerGallon) * milesMaybeDriven);
		}
	}
	
	public double getMilesDriven () {
		return this.milesDriven;
	}
	
	/**
	* Adds fuel to the tank as long as it does not exceed the tank�s capacity.
	* @return portion of fuel that couldn�t be added
	*/
	public double addFuel ( double gallons ) {
		double extraGallons = 0;
		if (this.currentFuel + gallons > this.maxFuel){
			extraGallons = gallons - (this.maxFuel - this.currentFuel);
			this.currentFuel = this.maxFuel;
			return extraGallons;
		} else {
			this.currentFuel = this.currentFuel + gallons;
			return 0;
		}
	}
	
	
}
