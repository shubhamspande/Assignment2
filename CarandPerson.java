package com.cdac.main;

class Person1 {

	  private String name;
	  private CAR4 car;

	  public Person1(String name, CAR4 car) {
	    this.name = name;
	    this.car = car;
	  }

	public String getName() {
	    return name;
	  }

	  public CAR4 getCar() {
	    return car;
	  }

	}

class CAR4{

	  private String make;
	  private String model;
	  private int year;

	  public CAR4(String make, String model, int year) {
	    this.make = make;
	    this.model = model;
	    this.year = year;
	  }

	  public String getMake() {
	    return make;
	  }

	  public String getModel() {
	    return model;
	  }

	  public int getYear() {
	    return year;
	  }

	}


public class CarandPerson {

	public static void main(String[] args) {
		
		Person1 p1=new Person1("Anuraj", new CAR4("TATA", "NANO", 2000));
		Person1 person = new Person1("Shubham", new CAR4("Honda", "Civic", 2022));
		
		System.out.println("Person name: " + p1.getName());
		System.out.println("Car make: " + person.getCar().getMake());
	}

}
