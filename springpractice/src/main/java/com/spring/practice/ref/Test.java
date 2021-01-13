package com.spring.practice.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/practice/ref/refconfig.xml");
		Bike b=(Bike)context.getBean("aref");
		System.out.println(b.getCost());
		System.out.println(b.getPs().getTube());
		System.out.println(b.getPs().getTyre());
		System.out.println("\n\n");
		System.out.println(b);

	}

}
