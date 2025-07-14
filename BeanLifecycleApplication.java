package com.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


// there are  3 ways to create bean life cycle methods in application : 

// 1 : implementing initializedBean and desposableBean 
// 2 : using annotation @PostConstruct and @PreDestroy
// 3 : using @Bean(initMethod="methodname", destroyMethod="methodname") at the bean creation method.
@SpringBootApplication
public class BeanLifecycleApplication {

	public static void main(String[] args) {
		 SpringApplication.run(BeanLifecycleApplication.class, args);
		
	}
	
	
	@Bean(initMethod="InitializingMethod" , destroyMethod="DestructingMethod")
	public Office getNewObject() {
		return new Office();
	}

}
