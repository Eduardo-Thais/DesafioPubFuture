package com.financasApp.financas.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TipoConta implements Serializable {
	
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String nome;
	
	@OneToMany(mappedBy = "tipoConta")
	private List<Contas> contas = new ArrayList<>(0);

	
	
	public TipoConta() {
		super();
	}

	public TipoConta(long id, String nome, List<Contas> contas) {
		super();
		this.id = id;
		this.nome = nome;
		this.contas = contas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
