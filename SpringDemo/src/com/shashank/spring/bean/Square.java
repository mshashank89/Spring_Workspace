package com.shashank.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Square implements InitializingBean, DisposableBean{
	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;
	
	public void draw() {
		System.out.println("Point 1 : x=" + point1.getX() + " y=" + point1.getY());
		System.out.println("Point 2 : x=" + point2.getX() + " y=" + point2.getY());
		System.out.println("Point 3 : x=" + point3.getX() + " y=" + point3.getY());
		System.out.println("Point 4 : x=" + point4.getX() + " y=" + point4.getY());
	}
	
	public Point getPoint1() {
		return point1;
	}
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}
	public Point getPoint2() {
		return point2;
	}
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	public Point getPoint3() {
		return point3;
	}
	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	public Point getPoint4() {
		return point4;
	}
	public void setPoint4(Point point4) {
		this.point4 = point4;
	}
	
	
	public void myInit() {
		System.out.println("My init method in Square class called.");
	}
	
	public void cleanUp() {
		System.out.println("My cleanup method in Square class called.");
	}

	

	@Override
	public void afterPropertiesSet() throws Exception {
		 System.out.println("afterPropertiesSet() method in InitializingBean called.");
		
	}
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() method in InitializingBean called.");
	}
}
