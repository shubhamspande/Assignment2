package com.cdac.main;

import java.util.Scanner;

public class AreaRectangle {
	
	
int length,width;
	
	
	void setDim(int length,int width) {
		this.length=length;
		this.width=width;
			
	}
	void  getArea() {
		System.out.println("Area of rectangle : "+length*width);
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AreaRectangle r1=new AreaRectangle();
		System.out.println("Enter length of rectangle :");
		r1.length=sc.nextInt();
		System.out.println("Enter width of rectangle : ");
		r1.width=sc.nextInt();
		r1.setDim(r1.length, r1.width);
		
		r1.getArea();

	}

}
