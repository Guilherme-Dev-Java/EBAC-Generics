package com.carlosguilherme.generics.domain;

public class Lamborghini extends Car {

	private Boolean cambioBorboleta;
	
	public Lamborghini(Long id, int horsePower, String fuelSource, String color, Boolean cambioBorboleta) {
		super(id,horsePower, fuelSource, color);
		this.cambioBorboleta = cambioBorboleta;
		
	}
	


}
