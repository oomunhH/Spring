package com.dto;

import java.util.List;
import java.util.Set;

/**
 * @author acorn
 *
 */
public class Student {
	private String name;
	private int age;
	private Set<Cat> setcat;
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

	public Set<Cat> getSetcat() {
		return setcat;
	}
	public void setSetcat(Set<Cat> setcat) {
		this.setcat = setcat;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", setcat=" + setcat + "]";
	}
	
	


	
	
	
	
	
}
