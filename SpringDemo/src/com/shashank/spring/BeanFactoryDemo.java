package com.shashank.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.shashank.spring.bean.Triangle;

public class BeanFactoryDemo {

	public static void main(String[] args) {

		Triangle triangle = new Triangle();
		triangle.draw();
		
		//spring.xml should be present in the projectHome path.
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle springBean = (Triangle)factory.getBean("triangle");
		
		springBean.draw();
	}

}
