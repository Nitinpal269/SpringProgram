package com.spring.practice.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	@Autowired 
	
	private Marks marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(Marks marks) {
		super();
		System.out.println("by constructor");
		this.marks = marks;
	}

	public Marks getMarks() {
		return marks;
	}
	
	public void setMarks(Marks marks) {
		System.out.println("by setter method");
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + "]";
	}
	

}
