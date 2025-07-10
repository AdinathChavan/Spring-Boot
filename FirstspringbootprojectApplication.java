package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication  //taking @ComponentScan , @Configuration , @AutoEnabled in one 
public class FirstspringbootprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(FirstspringbootprojectApplication.class, args);
		
		College one = (College) container.getBean("college1");
		
		
		System.out.println("*********************");
		
		
		System.out.println(one.getCollegeName());
		System.out.println(one.getStudent().getName());
		System.out.println(one.getStudent().getId());
	}

}
