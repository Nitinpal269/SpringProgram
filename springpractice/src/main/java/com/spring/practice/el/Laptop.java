package com.spring.practice.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Laptop {
	@Value("#{4+4}")
	private String ram;
	@Value("#{500+500}")
	private String harddisk;
	public Laptop(String ram, String harddisk) {
		super();
		this.ram = ram;
		this.harddisk = harddisk;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(String harddisk) {
		this.harddisk = harddisk;
	}
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", harddisk=" + harddisk + "]";
	}
	
	
	
	

}
