package com.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(1)
@Component
public class Dashboard implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run method from Dashboard....");
	}
	

}
