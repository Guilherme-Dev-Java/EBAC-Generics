package com.carlosguilherme.generics.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.carlosguilherme.generics.domain.Car;

public abstract class GenericDAO<T extends Car> implements IGenericDAO<T> {

	protected Map<Class, Map<Long, T>> map;

	public abstract Class<T> getTipoClasse();

	public GenericDAO() {
		this.map = new HashMap<>();
		Map<Long, T> mapClass = this.map.get(getTipoClasse());
		if (mapClass == null) {
			mapClass = new HashMap<>();
			this.map.put(getTipoClasse(), mapClass);

		}
	}

	@Override
	public Boolean cadastrar(T tipo) {
		Map<Long, T> mapClass = this.map.get(getTipoClasse());
		if (mapClass.containsKey(tipo.getId())) {
			return false;
		}
		mapClass.put(tipo.getId(), tipo);
		return true;
	}

	@Override
	public void excluir(Long valor) {
		Map<Long, T> mapClass = this.map.get(getTipoClasse());
		T objetoCadastrado = mapClass.get(valor);
		if(objetoCadastrado != null) {
			this.map.remove(valor, objetoCadastrado);
		}
			
	}


	@Override
	public T consultar(Long valor) {
		Map<Long, T> mapClass = this.map.get(getTipoClasse());
		return mapClass.get(valor);
	}

	@Override
	public Collection<T> buscarTodos() {
		Map<Long, T> mapClass = this.map.get(getTipoClasse());
		return mapClass.values();
	}

}
