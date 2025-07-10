package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean
	public Student student1() {
		Student one = new Student();
		one.setId(88);
		one.setName("adinath chavan");
		return one;
	}
	
	
	@Bean
	public College college1() {
		College one = new College();
		one.setCollegeName("Govindrao junior college, Ichalkaranji");
		return one;
	}
}
