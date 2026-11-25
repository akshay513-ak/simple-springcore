package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.Coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@RestController
public class DemoController {
	// Define a Private field for dependency
	
	private Coach myCoach;
//	private Coach anotherCoach;
	// Define a Constructor for dependency injection
	/* Constructor Injection
	@Autowired
	public DemoController(Coach theCoach)
	{
		this.myCoach = theCoach;
	} */
	
	// Setter Injection
	

	// We specified a the class name to clear ambiguity to when multiple class implementations are there
//	public void setCoach(Coach theCoach)
//	{
//		System.out.println("In Constructor: "+ getClass().getSimpleName());
//
//		myCoach = theCoach;
//	}
	// We specified a the class name to clear ambiguity to when multiple class implementations are there

	@Autowired
	public void setCoach(@Qualifier("swimCoach") Coach theCoach)
	{
		
		System.out.println("In Constructor: "+ getClass().getSimpleName());

		this.myCoach = theCoach;
		//anotherCoach = theAnotherCoach;
	}
	//@GetMapping("/check")
	
	/*public String check()
	{
		return "Comparing beans myCoach = anotherCoach, "+(myCoach == anotherCoach);
	}*/
	
	@GetMapping("/dailyworkout")
	public String DailyWorkout()
	{
		return myCoach.getDailyWorkout();
	}
	//Define init methods
	
	//@PostConstruct
	
	/*public void doMyStuff()
	{
		System.out.println("In doMyStuff(): "+getClass().getSimpleName());
	}
	
	@PreDestroy
	public void doMyCleanStuff()
	{
		System.out.println("In doMyStuff(): "+getClass().getSimpleName());
	}*/
	
}
