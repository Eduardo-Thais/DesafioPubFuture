package com.financasApp.financas.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.financasApp.financas.model.TipoDespesa;
import com.financasApp.financas.repository.TipoDespesaRepository;

@RestController
public class TipoDespesaController {
	
	@Autowired
	private TipoDespesaRepository tdr;
	
	@RequestMapping(value = "/cadastrarTipoDespesa", method = RequestMethod.POST)
	public boolean cadastrarTipoDespesa(@RequestBody TipoDespesa tipoDespesa){
		
		tdr.save(tipoDespesa);
		
		return true;
		
	}
	
	@RequestMapping(value = "/editaTipoDespesa/{id}")
	public boolean editaTipoDespesa(@RequestBody TipoDespesa tipoDespesa,@PathVariable long id) {
		tipoDespesa.setId(id);
		
		tdr.save(tipoDespesa);
		
		
		return true;
	}
	
	@RequestMapping(value = "/deletaTipoDespesa/{id}")
	public boolean deletaTipoDespesa(@PathVariable long id) {
		TipoDespesa tipoDespesa = tdr.findById(id);
		tdr.delete(tipoDespesa);
		
		return true;
	}
	
	
	@RequestMapping("/listarTipoDespesa")
	public Iterable<TipoDespesa> listarTipoDespesa() {
		Iterable<TipoDespesa> tipoDespesa = tdr.findAll();
		return tipoDespesa;
	}
	
}
