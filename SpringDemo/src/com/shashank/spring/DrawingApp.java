package com.shashank.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shashank.spring.bean.Square;
import com.shashank.spring.bean.Triangle;

public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		drawTriangle(context);
		
		drawSquare(context);
	}

	private static void drawSquare(ApplicationContext context) {
		Square square = (Square)context.getBean("square");
		square.draw();
	}

	private static void drawTriangle(ApplicationContext context) {
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
		
		triangle = (Triangle)context.getBean("constTriangle");
		triangle.draw();
		
		triangle = (Triangle)context.getBean("constHeightTriangle");
		triangle.draw();
	}

}
