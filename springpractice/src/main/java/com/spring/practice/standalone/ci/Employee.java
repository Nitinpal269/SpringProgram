package com.spring.practice.standalone.ci;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	
	private List<String> phones;
	private Set<String> languages;
	private Map<String, String> courses;
	public Employee(List<String> phones, Set<String> languages, Map<String, String> courses) {
		super();
		this.phones = phones;
		this.languages = languages;
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getLanguages() {
		return languages;
	}
	public void setLanguages(Set<String> languages) {
		this.languages = languages;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Employee [phones=" + phones + ", languages=" + languages + ", courses=" + courses + "]";
	}
	
	

}
