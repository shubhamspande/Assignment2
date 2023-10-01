package com.cdac.main;


class Car1{
	private double milage;
	private int fuel_level;
	 static int number_cars=0;
	public String toString() {  /// This method invoked only using object of class.
        return "Car{" + 
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
	public Car1() {
		number_cars++;
	}
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	public int getFuel_level() {
		return fuel_level;
	}
	public void setFuel_level(int fuel_level) {
		this.fuel_level = fuel_level;
	}
	int year;  
	String make;
	String model;
	void EngineStatus() {
		System.out.println("Engine Started");
	}
	void SetData(int y,String mk,String mo) {
		year=y;
		make=mk;
		model=mo;
	}
	void CarDetails() {
		System.out.println("Making of car is done by :"+make+" Model of car is :"+model+" and year is: "+year);
		System.out.println("Milage of car is :"+getMilage()+" Remaining fuel is :"+getFuel_level());
	}
}

class Electriccar extends Car1{
	
	int batterysize;
	void EngineStatus() {
		System.out.println("Electric motor Started");
	}
	void CarDetails() {
		System.out.println("Making of car is done by :"+make+" Model of car is :"+model+" and year is: "+year+" and size of electric battery is "+batterysize);
		System.out.println("Milage of car is :"+getMilage()+" Remaining fuel is :"+getFuel_level());
	}

public class Electric {

	private int batterysize;

	public void main(String[] args) {
		
		Electric e1=new Electric();
		Car1 c1=new Car1();
		Car1 c2=new Car1();
		Car1 c3=new Car1();
		Car1 c4=new Car1();
		Car1 c5=new Car1();
		Car1 c6=new Car1();
		e1.SetData(2000, "Tata", "NANO");
		e1.batterysize=10000;
		
		c1.SetData(1996, "Tata", "Alto");
		c1.EngineStatus();
		e1.EngineStatus();
		c1.setMilage(25.12);
		c1.setFuel_level(7);
		e1.setMilage(50.5);
		e1.setFuel_level(57);
		
		c1.CarDetails();
		e1.CarDetails();
		
		System.out.println("Count : "+Car1.number_cars);
		
		System.out.println(c1); /// This call toString method which print data written in it.
		System.out.println(e1); /// This call toString method which print data written in it.
	}

	private void SetData(int i, String string, String string2) {
	
	}

	private void setMilage(double d) {
	}

	private void EngineStatus() {
	}

	private void setFuel_level(int i) {
	}

	private void CarDetails() {
	}
}
}
