package com.financasApp.financas.repository;

import org.springframework.data.repository.CrudRepository;

import com.financasApp.financas.model.TipoDespesa;

public interface TipoDespesaRepository extends CrudRepository<TipoDespesa, String>{
	TipoDespesa findById(long id);
}
