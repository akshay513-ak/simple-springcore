package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
	
	public TrackCoach()
	{
		System.out.println("In Constructor: "+ getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run Hard 5k!!";
	}

}
