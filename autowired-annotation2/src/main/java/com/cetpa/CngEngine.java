package com.cetpa;

import org.springframework.stereotype.Component;

@Component
public class CngEngine implements FourWheelerEngine 
{
	public CngEngine()
	{
		System.out.println("CNG engine is created...");
	}
	public void startEngine() 
	{
		System.out.println("CNG engine is started...");
	}
	public void stopEngine() 
	{
		System.out.println("CNG engine is stopped...");
	}
}
