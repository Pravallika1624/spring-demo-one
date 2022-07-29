package com.pravallika.springdemo;

import java.util.Random;

public class BestFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] Fortunes={"Today is good","Tommorrow is Good","Yesterday was good"};
		int rnd=new Random().nextInt(Fortunes.length);
		return Fortunes[rnd];
	}

}
