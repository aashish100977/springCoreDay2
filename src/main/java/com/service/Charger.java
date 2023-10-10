package com.service;

public class Charger {
	
	
	
	 String name;
	 String year;
	int price;
	public Charger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Charger(String name, String year, int price) {
		super();
		this.name = name;
		this.year = year;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", year=" + year + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
