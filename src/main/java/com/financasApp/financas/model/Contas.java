package com.financasApp.financas.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Contas implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private double saldo;
	private String instituicaoFinanceira;
	
	@ManyToOne
	@JoinColumn(name = "tipoConta",referencedColumnName = "id", nullable=false)
	private TipoConta tipoConta;
	
	@OneToMany(mappedBy = "conta")
	private List<Receitas> receita = new ArrayList<>(0);
	
	@OneToMany(mappedBy = "conta")
	private List<Despesas> despesa = new ArrayList<>(0);
	
	
	public Contas() {
		super();
	}

	public Contas(double saldo, String instituicaoFinanceira) {
		super();
		this.saldo = saldo;
		this.instituicaoFinanceira = instituicaoFinanceira;
	}
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getInstituicaoFinanceira() {
		return instituicaoFinanceira;
	}
	public void setInstituicaoFinanceira(String instituicaoFinanceira) {
		this.instituicaoFinanceira = instituicaoFinanceira;
	}
	
	
	
}
