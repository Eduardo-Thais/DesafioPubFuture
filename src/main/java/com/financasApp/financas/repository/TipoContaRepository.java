package com.financasApp.financas.repository;

import org.springframework.data.repository.CrudRepository;

import com.financasApp.financas.model.TipoConta;

public interface TipoContaRepository extends CrudRepository<TipoConta, String>{
	TipoConta findById(long id);
}
