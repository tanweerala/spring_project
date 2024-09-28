package com.cetpa;

import org.springframework.stereotype.Controller;

@Controller
public class BB 
{
	public BB()
	{
		System.out.println("Bean BB is created...");
	}
	public void show()
	{
		System.out.println("Show method of class BB is called...");
	}
}
