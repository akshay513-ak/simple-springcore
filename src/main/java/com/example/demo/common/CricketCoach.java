package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
	
	public CricketCoach()
	{
		System.out.println("In Constructor: "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice Batting for 2 hous in the nets";
	}
	
}
