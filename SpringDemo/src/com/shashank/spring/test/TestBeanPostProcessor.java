package com.shashank.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shashank.spring.bean.Square;

public class TestBeanPostProcessor {
/*
 * 
Output :
--------------------------

In method postProcessBeforeInitialization(). Bean name is point1
In method postProcessAfterInitialization(). Bean name is point1
In method postProcessBeforeInitialization(). Bean name is point2
In method postProcessAfterInitialization(). Bean name is point2
In method postProcessBeforeInitialization(). Bean name is point3
In method postProcessAfterInitialization(). Bean name is point3
In method postProcessBeforeInitialization(). Bean name is point4
In method postProcessAfterInitialization(). Bean name is point4
In method postProcessBeforeInitialization(). Bean name is beanPostProcessorSquare
In method postProcessAfterInitialization(). Bean name is beanPostProcessorSquare

 */
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Square square = (Square)context.getBean("square");
		square.draw();
	}

}
