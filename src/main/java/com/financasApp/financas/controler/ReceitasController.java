package com.financasApp.financas.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.financasApp.financas.model.Receitas;
import com.financasApp.financas.repository.ReceitasRepository;

@RestController
public class ReceitasController {
	
	@Autowired
	private ReceitasRepository rr;
	
	@RequestMapping(value = "/cadastrarReceita", method = RequestMethod.POST)
	public boolean cadastrarReceita(@RequestBody Receitas receita){
		
		rr.save(receita);
		
		return true;
		
	}
	
	@RequestMapping(value = "/editaReceita/{id}")
	public boolean editaReceitas(@RequestBody Receitas receita,@PathVariable long id) {
		receita.setId(id);
		
		rr.save(receita);
		
		
		return true;
	}
	
	@RequestMapping(value = "/deletaReceita/{id}")
	public boolean deletaReceitas(@PathVariable long id) {
		Receitas receitas = rr.findById(id);
		rr.delete(receitas);
		
		return true;
	}
	
	@RequestMapping(value = "/listarReceitasDatas")
	public List<Receitas> listaReceitasPorData(String dataInicial, String datafinal){
		List<Receitas> receitas = rr.findByDataRecebimentoBetween(dataInicial, datafinal);
		
		return receitas;
	}
	
	@RequestMapping("/listarReceitas")
	public Iterable<Receitas> listarReceitas() {
		Iterable<Receitas> receitas = rr.findAll();
		return receitas;
	}
	
	
	
	
	
}
