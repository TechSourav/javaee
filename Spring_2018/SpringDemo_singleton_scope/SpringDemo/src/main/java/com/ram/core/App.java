package com.ram.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.model.Employee;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		System.out.println("-------------------------------------------");

		Employee employee1 = (Employee) context.getBean("employee");
		employee1.setName("John");

		System.out.println(
				"Got employee object from the ApplicationContext(Spring Container)");

		System.out.println(employee1);

		System.out.println("-------------------------------------------");
		
		Employee employee2 = (Employee) context.getBean("employee");
		System.out.println(
				"Got employee object from the ApplicationContext(Spring Container)");
		System.out.println(employee2);

	}

}
