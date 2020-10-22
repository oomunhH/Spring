package com.dto;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author acorn
 *
 */
public class Student {
	private String name;
	private int age;
	

	public Student() {
		super();
		System.out.println("기본 생성자 생성");
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void xxx() {
		System.out.println("초기화 메서드");
	}
	
	@PreDestroy
	public void yyy() {
		System.out.println("자원반납 메서드");
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

	public void setAge(int age) {
		this.age = age;
	}
	


	
	
	
	
	
}
