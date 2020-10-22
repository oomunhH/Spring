package com.dto;

/**
 * @author acorn
 *
 */
public class Student {
	private String name;
	private int age;
	
	public Student(int age) {
		super();
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}


	
	
	
	
	
}
