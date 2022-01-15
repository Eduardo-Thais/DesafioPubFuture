package com.financasApp.financas.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.financasApp.financas.model.TipoConta;
import com.financasApp.financas.repository.TipoContaRepository;

@RestController
public class TipoContaController {
	
	@Autowired
	private TipoContaRepository tcr;
	
	@RequestMapping(value = "/cadastrarTipoConta", method = RequestMethod.POST)
	public boolean cadastrarTipoConta(@RequestBody TipoConta tipoConta){
		
		tcr.save(tipoConta);
		
		return true;
		
	}
	
	@RequestMapping(value = "/editaTipoConta")
	public boolean editaTipoConta(@RequestBody TipoConta tipoConta, long id) {
		tipoConta.setId(id);
		
		tcr.save(tipoConta);
		
		
		return true;
	}
	
	@RequestMapping(value = "/deletaTipoConta/{id}")
	public boolean deletaTipoConta(@PathVariable long id) {
		TipoConta tipoConta = tcr.findById(id);
		tcr.delete(tipoConta);
		
		return true;
	}
	
	
	@RequestMapping("/listarTipoConta")
	public Iterable<TipoConta> listarTipoConta() {
		Iterable<TipoConta> tipoConta = tcr.findAll();
		return tipoConta;
	}
}
