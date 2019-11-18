package com.wondersgroup.bean;

public class Car {

	private String brand;
	private String color;
	private Integer price;
	public Car() {
		super();
		System.out.println("car±»´´½¨¡­¡­");
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
}
