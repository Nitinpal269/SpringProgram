package com.spring.practice.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hello")
public class Student {
	
	@Value("Arun Kumar")
	private String name;
	@Value("345")
	private int rollno;
	@Value("Delhi")
	private String city;
	public Student(String name, int rollno, String city) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", city=" + city + "]";
	}
	

}
