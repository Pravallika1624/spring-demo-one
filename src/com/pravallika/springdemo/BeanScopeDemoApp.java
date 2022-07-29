package com.pravallika.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve bean from spring container
		
	Coach theCoach = context.getBean("myCoach",Coach.class);
	
	Coach alphaCoach = context.getBean("myCoach",Coach.class);
	//chack if the are same
	boolean result=(theCoach==alphaCoach);
	System.out.println("\nPointing to the same Object : "+result);
	
	System.out.println("\nMemory Location for theCoach"+ theCoach);
	System.out.println("\nMemory Location for theCoach"+ alphaCoach);
	
	}

}
