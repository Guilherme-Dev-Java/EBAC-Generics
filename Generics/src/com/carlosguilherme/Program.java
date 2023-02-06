package com.carlosguilherme;

import java.util.ArrayList;
import java.util.List;

import com.carlosguilherme.generics.domain.Car;
import com.carlosguilherme.generics.domain.Ferrari;
import com.carlosguilherme.generics.domain.Fiat;
import com.carlosguilherme.generics.domain.Lamborghini;
import com.carlosguilherme.generics.domain.Toyota;

public class Program {

	public static void main(String[] args) {
		
		Car carro1 = new Fiat(1L, 450, "Full", "Gray");
		Car carro2 = new Lamborghini(2L,  1450, "Full", "White", true);
		Car carro3 = new Ferrari(3L,  1650, "Full", "Red", true);
		Car carro4 = new Toyota(4L,  750, "Full", "Silver");

		List<Car> carros = new ArrayList<>();
		
		carros.add(carro4);
		carros.add(carro3);
		carros.add(carro2);
		carros.add(carro1);
	
	}

}
