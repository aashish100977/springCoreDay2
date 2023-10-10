package com.service;

public class Laptop {
	
	
	String brand;
	String year;
	
	int cost;
	Charger charger;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String brand, String year, int cost, Charger charger) {
		super();
		this.brand = brand;
		this.year = year;
		this.cost = cost;
		this.charger = charger;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Charger getCharger() {
		return charger;
	}
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", year=" + year + ", cost=" + cost + ", charger=" + charger + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}