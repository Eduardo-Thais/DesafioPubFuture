package com.financasApp.financas.repository;

import org.springframework.data.repository.CrudRepository;

import com.financasApp.financas.model.TipoReceita;

public interface TipoReceitaRepository extends CrudRepository<TipoReceita, String>{
	TipoReceita findById(long id);
}
