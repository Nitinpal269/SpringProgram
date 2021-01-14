package com.spring.practice.lifecycle;

//lifecycle method insert through xml file
public class Student {
	
	private String name;
	private int rollno;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void init() {
		System.out.println("init method here");
	}
	public void destroy() {
		System.out.println("destroy method here");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
	

}
