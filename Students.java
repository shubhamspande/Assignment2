package com.cdac.main;

public class Students {
	
	int age;
	char grade;
	String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void Display() {
		System.out.println(name +" "+age+" "+grade);
}
	public static void main(String[] args) {
		
		Students s1=new Students();
		s1.setName("Anuraj");
		s1.setAge(22);
		s1.setGrade('A');;
		s1.Display();
		
		Students s2=new Students();
		
		s2.setAge(27);
		s2.setName("Shubham");
		s2.setGrade('A');
		s2.Display();
		
	
	}
	}

