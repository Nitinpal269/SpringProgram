package com.spring.practice.auto.wire;

public class Student {
	private Marks marks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Marks marks) {
		super();
		this.marks = marks;
	}

	public Marks getMarks() {
		return marks;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + "]";
	}
	

}
