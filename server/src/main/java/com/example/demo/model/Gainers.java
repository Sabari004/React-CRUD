package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gainers {
	@Id
	private int id;
	private String name;
	private int beforePrice;
	private int afterPrice;
	private int increasePercentage;
	private int topGain;

	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBeforePrice() {
		return beforePrice;
	}
	public void setBeforePrice(int beforePrice) {
		this.beforePrice = beforePrice;
	}
	public int getAfterPrice() {
		return afterPrice;
	}
	public void setAfterPrice(int afterPrice) {
		this.afterPrice = afterPrice;
	}
	public int getIncreasePercentage() {
		return increasePercentage;
	}
	public void setIncreasePercentage(int increasePercentage) {
		this.increasePercentage = increasePercentage;
	}
	public int getTopGain() {
		return topGain;
	}
	public void setTopGain(int topGain) {
		this.topGain = topGain;
	}
	
	

}
