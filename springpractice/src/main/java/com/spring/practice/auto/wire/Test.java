package com.spring.practice.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/spring/practice/auto/wire/autoconfig.xml");
		Student s=context.getBean("student",Student.class);
		System.out.println(s);

	}

}
