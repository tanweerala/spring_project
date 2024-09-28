package com.cetpa;

public class BB 
{
	private AA obj;
	public BB()
	{
		System.out.println("Bean BB is created using default constructor...");
	}
	public BB(AA obj)
	{
		System.out.println("Bean BB is created using parameterzied constructor...");
		System.out.println("Dependency is injected using parameterized constructor...");
		this.obj=obj;
	}
	public void setObj(AA obj)
	{
		System.out.println("Dependency is injected using setter...");
		this.obj=obj;
	}
	public void disp()
	{
		obj.show();
	}
}
