package com.dto;

/**
 * @author acorn
 *
 */
public class Student {
	private String name;

	public Student() {
		super();
		System.out.println("Student 기본생성자 생성");
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("set함수 호출===================");
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name +"]";
	}


	
	
	
	
	
}
