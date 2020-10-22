package com.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author acorn
 *
 */
public class Student {
	private String name;
	private int age;
	private Map<String,Cat> cats;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Map<String, Cat> getCats() {
		return cats;
	}
	public void setCats(Map<String, Cat> cats) {
		this.cats = cats;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", cats=" + cats + "]";
	}
	
	
	


	
	
	
	
	
}
