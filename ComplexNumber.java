package com.cdac.main;

import java.util.Scanner;

public class ComplexNumber {
	
	private double real;
    private double imaginary;
    public ComplexNumber() {
		
	}
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }
    public ComplexNumber Add(ComplexNumber other) {
    	double newreal = this.real + other.real;
    	double newimg = this.imaginary + other.imaginary;
    	return new ComplexNumber(newreal,newimg);
    	
    }
    public ComplexNumber Sub(ComplexNumber other) {
    	double newreal = this.real - other.real;
    	double newimg = this.imaginary - other.imaginary;
    	return new ComplexNumber(newreal,newimg);
    	
    }
    

    
    public String toString() {
        return real + " + " + imaginary + "i";
    }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
    	
		ComplexNumber a = new ComplexNumber();
		ComplexNumber b = new ComplexNumber();
		System.out.println("Enter real and imagenary part of first number :");
		a.real =sc.nextDouble();
		a.imaginary=sc.nextDouble();
		System.out.println("Enter real and imagenary part of second number :");
		b.real =sc.nextDouble();
		b.imaginary=sc.nextDouble();
		

		ComplexNumber c = a.multiply(b);
		ComplexNumber d = a.Add(b);
		ComplexNumber e = a.Sub(b);

		System.out.println("Multiplication of two number : "+c);
		System.out.println("Addition of two number : "+d);
		System.out.println("Subtraction of two number : "+e);
		
	}

	}


