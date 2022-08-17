package com.charan.learnspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LearnspringApplication {

	public static void main(String[] args) {
		//Creating a reference to the IoC container, ApplicationCoxtext
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//Requesting a bean from the IoC container
		
		Car car = (Car) context.getBean("car");
		
		car.startEngine();
		
	}

}
