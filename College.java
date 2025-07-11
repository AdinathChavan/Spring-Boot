package com.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	
	
	private Student student;
	
	public College() {
		System.out.println("College object created...");
	}
	
	
	@Autowired 
	public College( Student student) {
		this.student=student;
	}


	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
