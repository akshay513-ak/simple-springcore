package com.example.demo.common;

//import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

// @Lazy makes the constructor uninitialized
public class BaseballCoach implements Coach{
	
	public BaseballCoach() {
		System.out.println("In Constructor: "+ getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Play The Baseball daily 2 hours";
	}

}
