package com.carlosguilherme.generics.dao;

import java.util.Collection;

import com.carlosguilherme.generics.domain.Car;

public interface IGenericDAO <T extends Car>{
	
	public Boolean cadastrar (T tipo);
	
	public void excluir(Long valor);
			
	public T consultar(Long valor);
	
	public Collection<T> buscarTodos();


}
