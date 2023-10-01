package com.cdac.main;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;


public class Person {
	String name;
	int age;
	static String gender;
	public Person(int a){
	
	}
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "Gender"+gender+"]";

	}
	void information(Person p)
	{   
		System.out.println(p.toString());
	}
	void checkGender(int check) {
		if(check ==1)
			Person.gender ="Male";
		else {
			Person.gender = "Female";
		}
		   
	}

	public static void main(String[] args) 
	{
     Person p1=new Person(10);
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter name of person: ");
     p1.name=scanner.nextLine();
     System.out.println("Enter age of person: ");
     p1.age=scanner.nextInt();
     System.out.println("Enter gender of person: \n Press 1 for male \n Press 2 for Female  ");
     int check=scanner.nextInt();
     p1.checkGender(check);
     p1.information(p1);
		
		
		
	}

}
