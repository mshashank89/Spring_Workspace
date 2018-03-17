package com.shashank.spring.beanscope;

public class Point {

	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void myInit(){
		System.out.println("point init method");
	}
	
}
