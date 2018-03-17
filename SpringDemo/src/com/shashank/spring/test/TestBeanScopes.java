package com.shashank.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shashank.spring.beanscope.Circle;

public class TestBeanScopes {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("spring.xml");
		Circle circle1 = (Circle)context.getBean("circle");
		circle1.draw();
		
		Circle circle2 = (Circle)context.getBean("circle1");
		circle2.draw();
		
		Circle circle3 = (Circle)context.getBean("circle1");
		circle3.draw();
		
		
		Circle circle4 = (Circle)context2.getBean("circle");
		circle4.draw();
		
		Circle circle5 = (Circle)context2.getBean("circle1");
		circle5.draw();
		
		Circle circle6 = (Circle)context2.getBean("circle1");
		circle6.draw();
	}

}
