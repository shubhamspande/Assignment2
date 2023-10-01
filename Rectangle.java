package com.cdac.main;
import java.util.Scanner;
public class Rectangle {
	double length;
	double width;
	
	void area() {
		System.out.println("Area of rectangle is :"+ length*width);
	}


	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length: ");
		r1.length=sc.nextDouble();
		System.out.println("Enter width: ");
		r1.width=sc.nextDouble();
		
		r1.area();
	}
}
