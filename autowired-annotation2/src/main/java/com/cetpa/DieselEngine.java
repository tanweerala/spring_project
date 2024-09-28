package com.cetpa;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements FourWheelerEngine 
{
	public DieselEngine()
	{
		System.out.println("Diesel engine is created...");
	}
	public void startEngine() 
	{
		System.out.println("Diesel engine is started...");
	}
	public void stopEngine() 
	{
		System.out.println("Diesel engine is stopped...");
	}
}
