package com.dto;

public class Person {

	public Person(int y) {
		super();
		System.out.println("Person2 생성자"+y);
		// TODO Auto-generated constructor stub
	}
	public Person(String x) {
		super();
		System.out.println("Person1 생성자"+x);
		// TODO Auto-generated constructor stub
	}
	public Person(String xx, int yy) {
		super();
		System.out.println("Person3 생성자"+xx+"와"+yy);
		// TODO Auto-generated constructor stub
	}
	public Person(String xx, String yy) {
		super();
		System.out.println("Person4 생성자"+xx+"와"+yy);
		// TODO Auto-generated constructor stub
	}
	public String getInfo() {
		return "이순신";
		// TODO Auto-generated constructor stub
	}
}
