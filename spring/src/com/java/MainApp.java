package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	
	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("resource/spring.xml");
		/*flipkart f=(flipkart)app.getBean("f");
		f.purchace();*/
		/*car c=(car)app.getBean("c");
		c.display();*/
		
		carr c=(carr)app.getBean("c");
		c.displaycarnames();
		c.displaymodelyears();
		
	}
	
}
