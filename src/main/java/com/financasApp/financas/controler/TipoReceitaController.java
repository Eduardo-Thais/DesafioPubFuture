package com.financasApp.financas.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.financasApp.financas.model.TipoReceita;
import com.financasApp.financas.repository.TipoReceitaRepository;

@RestController
public class TipoReceitaController {
	
	@Autowired
	private TipoReceitaRepository trr;
	
	@RequestMapping(value = "/cadastrarTipoReceita", method = RequestMethod.POST)
	public boolean cadastrarTipoReceita(@RequestBody TipoReceita tipoReceita){
		
		trr.save(tipoReceita);
		
		return true;
		
	}
	
	@RequestMapping(value = "/editaTipoReceita")
	public boolean editaTipoReceita(@RequestBody TipoReceita tipoReceita, long id) {
		tipoReceita.setId(id);
		
		trr.save(tipoReceita);
		
		
		return true;
	}
	
	@RequestMapping(value = "/deletaTipoReceita/{id}")
	public boolean deletaTipoReceita(@PathVariable long id) {
		TipoReceita tipoReceita = trr.findById(id);
		trr.delete(tipoReceita);
		
		return true;
	}
	
	
	@RequestMapping("/listarTipoReceita")
	public Iterable<TipoReceita> listarTipoReceita() {
		Iterable<TipoReceita> tipoReceita = trr.findAll();
		return tipoReceita;
	}
	
}
