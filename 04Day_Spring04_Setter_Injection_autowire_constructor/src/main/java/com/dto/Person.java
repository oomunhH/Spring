package com.dto;

public class Person {

	private String username;
	Cat cat;
	@Override
	public String toString() {
		return "Person [username=" + username + ", cat=" + cat + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
}
