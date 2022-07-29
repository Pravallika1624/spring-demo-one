package com.pravallika.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//create the obj
		Coach theCoach=new TennisCoach();
		
		//use the obj
		System.out.println(theCoach.getDailyWorkout());
	}

}
