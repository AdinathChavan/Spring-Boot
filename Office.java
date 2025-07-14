package com.lifecycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Office {
	
	
	public void InitializingMethod() {
		System.out.println("init  own  method....");
	}
	
	
	public void DestructingMethod() {
		System.out.println("destroy method....");
	}

}
