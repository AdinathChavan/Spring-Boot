package com.runners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnersImplementationApplication {

	public static void main(String[] args) {
		System.out.println("before run method ....");
		SpringApplication.run(RunnersImplementationApplication.class, args);
		System.out.println("after run method");
	}

}
