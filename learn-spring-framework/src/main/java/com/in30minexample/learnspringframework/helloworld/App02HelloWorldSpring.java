package com.in30minexample.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in30minexample.learnspringframework.game.GameRunner;
import com.in30minexample.learnspringframework.game.MarioGame;
import com.in30minexample.learnspringframework.game.PacManGame;
import com.in30minexample.learnspringframework.game.SuperContraGame;

public class App02HelloWorldSpring {
     
	public static void main(String[] args) {

		//1:Launch a Spring Context
		
		try(var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			
			//2:Configure the things that we want spring to manage - 
			//HelloWorldConfiguration - @Configuration
			//name - @Bean
			
			//3:Retrieving Beans Managed by Spring
			
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("address2"));
			//System.out.println(context.getBean(Address.class));
			
			
			
		}
		
		
		
	}
}
