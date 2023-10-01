package com.cdac.main;

import java.util.Scanner;

public class student {
	int age;
	char grade;
	String name;
//	public int Getage() 
//	{
//	return age;	
//	}
//	public void Setage(int age)
//	{
//		this.age=age;
//	}
//	public char Getgrade()
//	{
//		return grade;
//	}
//	public void Setgrade(char grade)
//	{
//		this.grade=grade;
//	}
//	public String Getname()
//	{
//		return name;
//	}
//	public void Setname(String name)
//	{
//		this.name=name;
//	}
	void GetData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		System.out.println("Enter your grade: ");
		grade=sc.next().charAt(0);
		System.out.println("enter your name:  ");
		name=sc.nextLine();
		
		
		
		
		
	}
	
	
	
	
	void Display()
	{
		System.out.println("name:  "+name+"Grade:   "+grade+"age:   "+age);
	}
	
	
	
	
	

	public static void main(String[] args) {
		student s1=new student();
		s1.GetData();
		s1.Display();
	}

	
}
