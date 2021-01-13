package com.spring.practice.ref;

public class Parts {
	
	private int tube;
	private int tyre;
	public Parts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parts(int tube, int tyre) {
		super();
		this.tube = tube;
		this.tyre = tyre;
	}
	public int getTube() {
		return tube;
	}
	public void setTube(int tube) {
		this.tube = tube;
	}
	public int getTyre() {
		return tyre;
	}
	public void setTyre(int tyre) {
		this.tyre = tyre;
	}
	@Override
	public String toString() {
		return "Parts [tube=" + tube + ", tyre=" + tyre + "]";
	}
	

}
