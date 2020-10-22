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
	public Cat getCatty() {
		return cat;
	}
	public void setCatty(Cat cat1) {//set함수의 매개변수의 이름과 같은 id를 가진 객체를 주입받음.
		this.cat = cat1;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
}
