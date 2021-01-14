package com.spring.practice.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/practice/lifecycle/lifeconfig.xml");
		context.registerShutdownHook();
		Student s=(Student)context.getBean("student");
		System.out.println(s);
		//registering shutdown hook.
		
		Teacher t=(Teacher)context.getBean("teacher");
		System.out.println(t);
		
		Classroom c=(Classroom)context.getBean("class");
		System.out.println(c);
		
		

	}

}
