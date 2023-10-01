package com.cdac.main;

import java.util.Scanner;

public class Employee {

	String name;
	int ID;
	double salary;
	void Increment  (double amount)
	{
		salary+=amount;
	}
	void acceptrecord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name: ");
		name=sc.nextLine();
		System.out.println("Enter employee ID: ");
		ID=sc.nextInt();
		System.out.println("Enter employee salary: ");
		salary=sc.nextDouble();
		
	}
	void empdetails()
	{
		System.out.println("name: "+name+"\nID: "+ID+"\nsalary"+salary);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee s1=new Employee();
		s1.acceptrecord();
		s1.empdetails();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter amount of salary want to increase: ");
		double amount=sc.nextDouble();
		s1.Increment(amount);
	     s1.empdetails();
	
	
	}

}
