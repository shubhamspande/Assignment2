package com.cdac.main;

public class Triangle {
	
	double side1,side2,side3;
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	public Triangle(double side1,double side2,double side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		
	}
	
	void perimeter() {
		System.out.println("Perimeter of triangle is : "+ (side1+side2+side3));
	}
	
	void area() {
		double s=(side1+side2+side3)/2;
		double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("Area of triangle is : "+area);
		
	}

	public static void main(String[] args) {
		
		Triangle t1=new Triangle(3,6,7);
		t1.side1=3;
		t1.side2=7;
		t1.side3=5;
		t1.perimeter();
		t1.area();
		Triangle t2=new Triangle();
		

	}

}
