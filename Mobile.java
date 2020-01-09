package com.deloitte;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
 
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
//		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		String simName;
		System.out.println("insert sim:");
		simName=in.nextLine();
		Sim sim=(Sim)context.getBean(simName);
		sim.browse();
		sim.call();
		sim.sendSms();
	}
}
