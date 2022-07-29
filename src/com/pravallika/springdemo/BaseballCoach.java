package com.pravallika.springdemo;

public class BaseballCoach implements Coach {
		
		private FortuneService fortuneService;
		
		public BaseballCoach(FortuneService theFortuneService) {
			fortuneService=theFortuneService;
		}
	
		public String getDailyWorkout() {
			return "Spend 30 mins on Batting practice";
		}

		@Override
		public String gatDailyFortune() {
			//use my fortuneService to get a fortune
			return fortuneService.getFortune();
		}
}
