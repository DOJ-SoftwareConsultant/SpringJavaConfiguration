package com.doj.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CarDemo {
	
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext is using for XML based configuration
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//AnnotationConfigApplicationContext is using for JAVA based configuration
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Car car = (Car) context.getBean("car");
		car.driveCar();
		context.close();
	}
}
