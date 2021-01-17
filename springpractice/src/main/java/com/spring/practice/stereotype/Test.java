package com.spring.practice.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/practice/stereotype/stereoconfig.xml");
		Student student=(Student)context.getBean("hello");
		System.out.println(student);

	}

}
