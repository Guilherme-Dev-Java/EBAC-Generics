package com.carlosguilherme.generics.domain;

public abstract class Car {

	private Long id;
	private int horsePawer;
	public String fuelSource;
	private String color;

	public Car(Long id, int horsePower, String fuelSource, String color) {
		this.id = id;
		this.horsePawer = horsePower;
		this.fuelSource = fuelSource;
		this.color = color;
	}

	public int getHorsePawer() {
		return horsePawer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setHorsePawer(int horsePawer) {
		this.horsePawer = horsePawer;
	}

	public String getFuelSource() {
		return fuelSource;
	}

	public void setFuelSource(String fuelSource) {
		this.fuelSource = fuelSource;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void startEngine() {
		System.out.println("The" + fuelSource + "engine has been started, an is ready to utilize" + horsePawer);
	}

	public void clean() {
		System.out.println("Car has been cleaned, and the " + color.toLowerCase() + "color shines");
	}

	public void mechanicCheck() {
		System.out.println("Car has been checked by mechanic.Everything looks good!");
	}

	public void fuelCar() {
		System.out.println("Car is being filled with " + fuelSource.toLowerCase());
	}
	
	
}
