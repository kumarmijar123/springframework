package com.in30minexample.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {};

//Address - firstLine & city
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
     
	@Bean
	public String name() {
		return "kumar";
	}
	
	@Bean
	public int age() {
		return 45;
	}
	
	@Bean
	public Person person() {
		return new Person("Ram", 30, new Address("London", "Uk"));
		
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
		
	}
	
	@Bean
	public Person person3Parameters(String name, int  age, Address address3) {
		return new Person(name, age, address3);
		
	}
	
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("Dallu", "Kathmandu");
		
	}
	
	@Bean(name = "address3")
	public Address address3() {
		return new Address("Motinagar", "Hyderabad");
		
	}
	

}
