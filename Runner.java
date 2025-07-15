package com.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class Runner implements CommandLineRunner{
	
	public Runner() {
		System.out.println("Runner object created...");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run method from the CommandLineRunner");
	}
	

}
