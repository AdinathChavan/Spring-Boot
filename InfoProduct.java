package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InfoProduct {
	
	public InfoProduct() {
		System.out.println("InfoProduct object created....");
	}
	
	@Autowired
	ProductDetails productInfo;

	public void addInfo() {
		Product one = new Product();
		
		one.setId(12);
		one.setName("Laptop");
		one.setPrize(2234.43f);
		productInfo.save(one);
		
		Product two = new Product();
		two.setId(33);
		two.setName("Mobile");
		two.setPrize(7773.34f);
		
		productInfo.save(two);
		
	}
	
	
}
