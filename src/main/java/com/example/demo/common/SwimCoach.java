package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{
	
	public SwimCoach()
	{
		System.out.println("In Constructor: "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 1000 metres as Warm-Up";
	}
	
}
