package com.spring.practice.ref;

public class Bike {
	
	private int cost;
	private Parts ps;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int cost, Parts ps) {
		super();
		this.cost = cost;
		this.ps = ps;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Parts getPs() {
		return ps;
	}
	public void setPs(Parts ps) {
		this.ps = ps;
	}
	@Override
	public String toString() {
		return "Bike [cost=" + cost + ", ps=" + ps + "]";
	}
	

}
