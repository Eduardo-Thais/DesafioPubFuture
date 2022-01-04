package com.financasApp.financas.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Contas implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private double saldo;
	private String tipoConta;
	private String instituiçãoFinanceira;
	
	
	
	public Contas() {
		super();
	}

	public Contas(double saldo, String tipoConta, String instituiçãoFinanceira) {
		super();
		this.saldo = saldo;
		this.tipoConta = tipoConta;
		this.instituiçãoFinanceira = instituiçãoFinanceira;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public String getInstituiçãoFinanceira() {
		return instituiçãoFinanceira;
	}
	public void setInstituiçãoFinanceira(String instituiçãoFinanceira) {
		this.instituiçãoFinanceira = instituiçãoFinanceira;
	}
	
	
	
}
