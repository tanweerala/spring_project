package com.cetpa;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements FourWheelerEngine 
{
	public PetrolEngine()
	{
		System.out.println("Pertrol engine is created...");
	}
	public void startEngine() 
	{
		System.out.println("Petrol engine is started...");
	}
	public void stopEngine() 
	{
		System.out.println("Petrol engine is stopped...");
	}
}
