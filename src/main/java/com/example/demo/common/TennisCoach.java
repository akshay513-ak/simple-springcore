package com.example.demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
// @primary is used to which class has more priority to implement
//if both @qualifier and @primary are used @qualifier has more priority

public class TennisCoach implements Coach{
	
	public TennisCoach()
	{
		System.out.println("In Constructor: "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Tennis Daily 3 hours";
	}
	

}
