package com.financasApp.financas.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.financasApp.financas.model.Despesas;
import com.financasApp.financas.model.Receitas;
import com.financasApp.financas.repository.DespesasRepository;
import com.financasApp.financas.repository.ReceitasRepository;

@RestController
public class DespesasController {
	
	@Autowired
	private DespesasRepository dr;
	
	
	@RequestMapping(value = "/cadastrarDespesa", method = RequestMethod.POST)
	public boolean cadastrarDespesa(@RequestBody Despesas despesa){
		
		dr.save(despesa);
		
		return true;
		
	}
	
	@RequestMapping(value = "/editaDespesa/{id}")
	public boolean editaDespesa(@RequestBody Despesas despesa,@PathVariable long id) {
		despesa.setId(id);
		
		dr.save(despesa);
		
		
		return true;
	}
	
	@RequestMapping(value = "/deletaDespesa/{id}")
	public boolean deletaDespesa(@PathVariable long id) {
		Despesas despesa = dr.findById(id);
		dr.delete(despesa);
		
		return true;
	}
	
	@RequestMapping(value = "/listarDespesasDatas")
	public List<Despesas> listaReceitasPorData(@RequestBody String dataInicial, String datafinal){
		List<Despesas> despesa = dr.findBydataPagamentoBetween(dataInicial, datafinal);
		
		return despesa;
	}
	
	@RequestMapping("/listarDespesas")
	public Iterable<Despesas> listarDespesas() {
		Iterable<Despesas> despesas = dr.findAll();
		return despesas;
	}
}
