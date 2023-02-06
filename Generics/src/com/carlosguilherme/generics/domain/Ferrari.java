package com.carlosguilherme.generics.domain;

public class Ferrari extends Car{
	
	private Boolean cambioBorboleta;

	public Ferrari(Long id, int horsePower, String fuelSource, String color,Boolean cambioBorboleta ) {
		super(id,horsePower, fuelSource, color);
		this.cambioBorboleta = cambioBorboleta;
		
	}

	

}
