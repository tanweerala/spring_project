package com.cetpa;
public class Car 
{
	private FourWheelerEngine engine;
	//Here engine is name of dependency and FourWheelerEngine is type of dependency
	public Car()
	{
		System.out.println("Car is created using default constructor");
	}
	public Car(FourWheelerEngine engine)
	{
		System.out.println("Car is created using parameterized constructor");
		System.out.println("Engine is injected using parameterized constructor");
		this.engine=engine;//loose coupling
	}
	public void setEngine(FourWheelerEngine engine)
	{
		System.out.println("Engine is injected using setter method");
		this.engine=engine;
	}
	public void turnEngineOn()
	{
		engine.startEngine();
	}
	public void turnEngineOff()
	{
		engine.stopEngine();
	}
}
