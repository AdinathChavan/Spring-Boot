package com.constructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConstructorInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(ConstructorInjectionApplication.class, args);
		
		
		College one = (College) container.getBean("college");
		
		System.out.println("***************");
		
		System.out.println(one.getStudent().getId());
		System.out.println(one.getStudent().getName());
	}
	
	@Bean("student1")
	public Student getStudent() {
		Student one = new Student();
		one.setId(11);
		one.setName("adinath chavan");
		return one;
	}
	
	public College getCollege() {
		College one = new College();
		return one;
	}

}
