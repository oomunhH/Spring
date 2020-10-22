package com.dao;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("classpath:com/config/stu.xml");
		
		Student stup1=ctx.getBean("stu1",Student.class);
		Student stup2=ctx.getBean("stu1",Student.class);
		System.out.println("stup1==stup2 prototype scope로 객체생성시 :"+(stup1==stup2));
		Student stus3=ctx.getBean("stu2",Student.class);
		Student stus4=ctx.getBean("stu2",Student.class);
		System.out.println("stus3==stus4 prototype scope로 객체생성시 :"+(stus3==stus4));
		
		
	}

}
