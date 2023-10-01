package com.cdac.main;

import java.util.Scanner;

public class CarRace {
int Speed;
	
	static void Compare(CarRace e,CarRace f) {
		if (e.Speed > f.Speed) {
			System.out.println("Car1 is faster than Car2");
		}
		else {
			
			System.out.println("Car2 is faster than Car1");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		CarRace c1=new CarRace();
		CarRace c2=new CarRace();
		System.out.println("Enter speed for car1: ");
		
		c1.Speed=sc.nextInt();
		System.out.println("Enter speed of car2: ");
		c2.Speed=sc.nextInt();
		
		CarRace.Compare(c1,c2);
		
	}

}
