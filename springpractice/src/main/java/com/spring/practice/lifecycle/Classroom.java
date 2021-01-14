package com.spring.practice.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Classroom {
	
	private int bench;
	private int roomno;
	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBench() {
		return bench;
	}
	public void setBench(int bench) {
		this.bench = bench;
	}
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	@Override
	public String toString() {
		return "Classroom [bench=" + bench + ", roomno=" + roomno + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("Init method by Annotation PostConstruct");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method by Annotation PreDestroy");
	}

}
