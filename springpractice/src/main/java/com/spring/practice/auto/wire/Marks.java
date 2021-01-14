package com.spring.practice.auto.wire;

public class Marks {
	private int maths;
	private int physics;
	private int chemistry;
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marks(int maths, int physics, int chemistry) {
		super();
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	@Override
	public String toString() {
		return "Marks [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + "]";
	}
	

}
