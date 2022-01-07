package com.financasApp.financas.repository;

import org.springframework.data.repository.CrudRepository;

import com.financasApp.financas.model.Contas;

public interface ContasRepository extends CrudRepository<Contas, String>{
	Contas findById(Long id);
	Contas findByinstituicaoFinanceira(String instituicao);
}
