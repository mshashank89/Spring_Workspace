package com.shashank.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shashank.spring.bean.Square;

public class TestLifeCycleCallbackMethods {

/*
 * Custom methods as lifecycle callack methods
 * 1. We can define custom methods that can be used as lifeCycleCallback methods.
 * 2. Specify the lifecycle callback methods in the spring.xml by using init-method and destroy-method attributes in the <bean> tag.
 * 
 * ApplicationContext lifecycle callback methods.
 * 1. Implement Initializing bean interface and override afterPropertiesSet() method to implement init method.
 * 1. Implement Disposable bean interface and override destroy() method to implement destroy method.
 * 
 * 
 * Change ApplicationContext to AbstractApplicationContext to registerShutDownHook. 
 * This is required for desktop applications.
 * This is to let Spring know that it has to call the destroymethod after the main method ends.
 * 
 * 

Output with only custom lifecycle methods:
----------------------------------------
My init method in Square class called.
Point 1 : x=0 y=0
Point 2 : x=0 y=20
Point 3 : x=20 y=20
Point 4 : x=20 y=0
My cleanup method in Square class called.

----------------------------------------
Output with ApplicationContext lifecycle methods:
----------------------------------------
afterPropertiesSet() method in InitializingBean called.
My init method in Square class called.
Point 1 : x=0 y=0
Point 2 : x=0 y=20
Point 3 : x=20 y=20
Point 4 : x=20 y=0
destroy() method in InitializingBean called.
My cleanup method in Square class called.


 *
 */
	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		
		Square square = (Square)context.getBean("lifeCycleTestSquare");
		square.draw();
	}

}
