package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Laptop;

public class SpringMainContainer {

	public static void main(String[] args) {
		
		
		
		
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("laptop-charger.xml");
		
		
		
		Laptop lp=(Laptop) applicationContext.getBean("laptop");
		
		
		
		System.out.println(lp);
		
		
		
	}

}
