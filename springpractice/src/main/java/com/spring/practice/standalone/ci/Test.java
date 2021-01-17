package com.spring.practice.standalone.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/practice/standalone/ci/standconfig.xml");
		Employee e=(Employee)context.getBean("employee");
		System.out.println(e);
		System.out.println(e.getPhones().getClass().getName());
		System.out.println(e.getCourses().getClass().getName());

	}

}
