package com.cdac.main;

public class Car {
	
	String make;
	String model;
	int year;
	
	Car()
	{
		year=2010;
		model="nano";
		make="TATA";
		
	}
	
	void Start_Engine()
	{
		System.out.println("Engine is started");
	}

	void make () {
		System.out.println(make);
	}
	void model () {
		System.out.println(model);
	}
	void year () {
		System.out.println(year);
	}
	public static void main(String[] args) {
	Car c1=new Car();
	c1.year=1969;
	c1.model="Mustang";
	c1.make="Ford";
	c1.make();
	c1.model();
	c1.year();
//	c1.Start_Engine();
	Car c2=new Car();
	c2.make();
	c2.year();
	c2.model();
		
	}

}
