package com.training.model;

public class Vehicle {
	private Car car;
	private int id;
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void checkCarName() {
		car.checkCarName();
	}

}
