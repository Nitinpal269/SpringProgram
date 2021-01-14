package com.spring.practice.ci;

import java.util.List;

public class Person {

	private String name;
	private int age;
	private Certificate cer;
	private List<String> doc;
	public Person(String name, int age, Certificate cer, List<String> doc) {
		super();
		this.name = name;
		this.age = age;
		this.cer = cer;
		this.doc = doc;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cer=" + cer + ", doc=" + doc + "]";
	}
	
	
	
	
}
