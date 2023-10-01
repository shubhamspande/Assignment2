package com.cdac.main;

import java.util.ArrayList;
import java.util.List;

public class CarInventory {
	
	int year;
	String model;
	String make;
	double price;
	
	public CarInventory(int year,String model,String make,double price) {
		this.year=year;
		this.model=model;
		this.make=make;
		this.price=price;
		
	}
	public static void main(String[] args) {
	   
     List<CarInventory> car=new ArrayList<CarInventory>();
		
		car.add(new CarInventory(2015, "NANO","TATA", 100000));
		car.add(new CarInventory(2010, "Alto","TATA", 550000));
		car.add(new CarInventory(1956, "Indica","TATA", 650000));
		car.add(new CarInventory(2018, "Nexa","TATA", 920000));
		car.add(new CarInventory(2020, "Thar","Mahindra", 1500000));
		
		for (CarInventory i : car) {
			System.out.println("Model of car : "+i.model);
			System.out.println("Make of car : "+i.make);
			System.out.println("Year of launch : "+i.year);
			System.out.println("Price of car : "+i.price);
			System.out.println();

	}

}
}
