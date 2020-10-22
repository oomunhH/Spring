package com.dto;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author acorn
 *
 */
public class Student implements InitializingBean,DisposableBean {
	private String name;
	private int age;
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DispoableBean.destroy");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean.afterPropertiesSet");
		
	}
	public Student() {
		super();
		System.out.println("기본 생성자 생성");
		// TODO Auto-generated constructor stub
	}
	public void aaa() {
		System.out.println("init-mehtod.aaa");
		this.name="홍길동";
	}
	public void bbb() {
		System.out.println("destroy-mehtod.bbb");
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
