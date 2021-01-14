package com.spring.practice.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//lifecycle method insert through Interface
public class Teacher implements InitializingBean, DisposableBean {
	
	private String name;
	private String subject;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init method through Interface InitializingBean");
		
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy method through Interface DisposableBean");
		
	}
	
	

}
