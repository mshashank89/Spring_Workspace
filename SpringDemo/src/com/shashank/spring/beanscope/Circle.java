package com.shashank.spring.beanscope;

public class Circle {
	
	private int radius;
	private Point center;
	
	public void circleInit() {
		System.out.println("circle init method");
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw() {
		System.out.println("Center of the circle is : x=" + center.getX() + " y=" + center.getY());
		System.out.println("Radius of the circle is : " + radius);
	}

}
