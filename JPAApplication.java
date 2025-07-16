package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JPAApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(JPAApplication.class, args);
		
		InfoProduct product = container.getBean(InfoProduct.class);
		
		System.out.println("***********");
		
		product.addInfo();
		
	}

}
