package org.jsp.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mySpringConf.xml");
		Car c= context.getBean("myCar",Car.class);
		c.start();
	}

}
