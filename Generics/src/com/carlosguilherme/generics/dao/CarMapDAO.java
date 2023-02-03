package com.carlosguilherme.generics.dao;

import com.carlosguilherme.generics.domain.Car;

public class CarMapDAO extends GenericDAO<Car> implements ICarDAO {
	
	public CarMapDAO() {
		super();
	}

	@Override
	public Class<Car> getTipoClasse() {
		return Car.class;
	}

	
	
	
}
