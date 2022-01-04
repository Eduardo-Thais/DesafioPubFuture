package com.financasApp.financas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.financasApp.financas.model.Despesas;


public interface DespesasRepository extends CrudRepository<Despesas, String>{
	Despesas findByTipoDespesa(String receita);
	Despesas findById(long id);
	List<Despesas> findBydataPagamentoBetween(String dataInicial, String datafinal);
}
