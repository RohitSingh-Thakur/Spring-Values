package com.techcarver.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Configuration File is Loaded...");
		context.getBean("empObject", Employee.class).display();
	}
}
 