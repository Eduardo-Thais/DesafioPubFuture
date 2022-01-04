package com.financasApp.financas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.financasApp.financas.model.Receitas;

public interface ReceitasRepository extends CrudRepository<Receitas, String>{
	Receitas findByTipoReceita(String receita);
	Receitas findById(long id);
	List<Receitas> findByDataRecebimentoBetween(String dataInicial, String datafinal);
}
