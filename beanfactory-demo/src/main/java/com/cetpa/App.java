package com.cetpa;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
    	Resource r=new ClassPathResource("beans.xml");
    	BeanFactory factory=new XmlBeanFactory(r);
    	factory.getBean("b1");
    	factory.getBean("b2");
    }
}
