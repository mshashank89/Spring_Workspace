package com.shashank.spring.bean;

public class Triangle {
	
	private String type;
	private int height;

	public Triangle(String type) {
		this.type = type;
		this.height = 0;
	}
	
	public Triangle() {	
	}
	
	public Triangle(String type,int height) {
		this.type = type;
		this.height = height;
	}
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(type + " Triangle drawn of height " + height);
	}
}
