package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="pid")
	private int id;
	@Column(name="pname")
	private String name;
	@Column(name="pprize")
	private double prize;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}
	
	

}
