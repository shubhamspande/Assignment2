package com.cdac.main;

public class TemperatureConverter {
	
	
	double CelToFah(double cel) {
		double F = cel * (9/5) + 32;
		return F;
	}
	double FahToCel(double fah) {
		double C =(fah - 32)*5/9;
		return C;
	}

	public static void main(String[] args) {
		
		
		TemperatureConverter t1=new TemperatureConverter();
		TemperatureConverter t2=new TemperatureConverter();
		TemperatureConverter t3=new TemperatureConverter();
		
		System.out.println("Temperature from cel to fah is : "+t1.CelToFah(0));
		System.out.println("Temperature from fah to cel "+t1.FahToCel(555));
	}

}
