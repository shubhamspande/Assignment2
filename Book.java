package com.cdac.main;

import java.util.Scanner;

import javax.swing.border.TitledBorder;

public class Book {
	String title;
	String author;
	int publicationyear;
	
	void bookdetails()
	{
		System.out.println("title of book is: "+title);
		System.out.println("Author of book is: "+author);
        System.out.println("Publication year of book is: "+publicationyear);
        
	} 
	
	public static void main(String[] args) {
	    Book p1=new Book();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter title name: ");
		p1.title=scanner.nextLine();
		System.out.println("Enter author name: ");
		p1.author=scanner.nextLine();
		System.out.println("enter Publication year: ");
		p1.publicationyear=scanner.nextInt();
		p1.bookdetails();
	}

}
