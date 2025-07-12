package com.primitive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;


@PropertySource(value= {"database.properties"})
@SpringBootApplication
public class PrimitiveDataInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(PrimitiveDataInjectionApplication.class, args);
		
		Database data = (Database) container.getBean("database");
		System.out.println("*************");
		
		System.out.println(data.getUsername());
		System.out.println(data.getPassword());
		System.out.println(data.getUrl());
		System.out.println(data.getPortNo());
		System.out.println(data.getOwner());
		System.out.println(data.getMobileNo());
	}

}
