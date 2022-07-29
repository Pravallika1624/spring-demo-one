package com.pravallika.springdemo;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TennisCoach() {
		
	}
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do Practice atleast 40 mins a day";
	}

	@Override
	public String gatDailyFortune() {
		// TODO Auto-generated method stub
		return "This is practice purpose forttune method";
	}

}
