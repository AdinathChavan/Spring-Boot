package com.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


@Component
public class Employee implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This method is afterProperties set ...");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("this is destroy methods.....");
	}

}
