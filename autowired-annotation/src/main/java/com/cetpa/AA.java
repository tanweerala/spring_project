package com.cetpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AA 
{
	//@Autowired
	private BB obj;
	public AA()
	{
		System.out.println("Bean AA is created using default constructor...");
	}
	//@Autowired
	public AA(BB obj)
	{
		System.out.println("Bean AA is created using parameterzied constructor...");
		System.out.println("Dependency BB is injected using parameterzied constructor...");
		this.obj=obj;
	}
	@Autowired
	public void setObj(BB obj)
	{
		System.out.println("Dependency BB is injected using stter method...");
		this.obj=obj;
	}
	public void disp()
	{
		obj.show();
	}
}
