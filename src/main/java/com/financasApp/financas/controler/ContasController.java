package com.financasApp.financas.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.financasApp.financas.DTO.TransferenciaDTO;
import com.financasApp.financas.model.Contas;
import com.financasApp.financas.repository.ContasRepository;


@RestController
public class ContasController {
	
	@Autowired
	private ContasRepository cr;
	
	@RequestMapping(value = "/cadastrarConta", method = RequestMethod.POST)
	public boolean cadastrarConta(@RequestBody Contas conta){
		
		cr.save(conta);
		
		return true;
		
	}
	
	@RequestMapping(value = "/editaConta/{id}")
	public boolean editaConta(@RequestBody Contas conta,@PathVariable long id) {
		conta.setId(id);
		
		cr.save(conta);
		
		
		return true;
	}
	
	@RequestMapping(value = "/deletaConta/{id}")
	public boolean deletaConta(@PathVariable long id) {
		Contas conta = cr.findById(id);
		cr.delete(conta);
		
		return true;
	}
	
	
	@RequestMapping("/listarContas")
	public Iterable<Contas> listarContas() {
		Iterable<Contas> contas = cr.findAll();
		return contas;
	}
	
	@RequestMapping(value = "/transfereSaldoConta")
	public boolean transferirSaldoConta(@RequestBody TransferenciaDTO transferencia) {
		
		Contas contaOrigem = cr.findById(transferencia.getIdOrigem());
		Contas contaDestino = cr.findById(transferencia.getIdDestino());
		
		
		if(contaOrigem.getSaldo() >= transferencia.getQuantia()) {
			contaOrigem.setSaldo(contaOrigem.getSaldo() - transferencia.getQuantia());
			contaDestino.setSaldo(contaDestino.getSaldo() + transferencia.getQuantia());
			
			cr.save(contaOrigem);
			cr.save(contaDestino);
		}
		
		
		return true;
	}
	
	@RequestMapping(value = "/saldoConta/{id}")
	public double listarSaldoConta(@PathVariable long id) {
		Contas conta = cr.findById(id);
		
		
		return conta.getSaldo();
	}
	
}
