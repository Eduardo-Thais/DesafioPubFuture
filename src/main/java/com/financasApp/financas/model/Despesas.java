package com.financasApp.financas.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Despesas implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private double valor;
	private String dataPagamento;
	private String dataPagamentoEsperado;
	
	
	
	@ManyToOne
	@JoinColumn(name = "conta",referencedColumnName = "id", nullable=false)
	private Contas conta;
	
	@ManyToOne
	@JoinColumn(name = "tipoDespesa",referencedColumnName = "id", nullable=false)
	private TipoDespesa tipoDespesa;
	
	
	public Despesas() {
		super();
	}
	
	public Despesas(double valor, String dataPagamento, String dataPagamentoEsperado) {
		super();
		this.valor = valor;
		this.dataPagamento = dataPagamento;
		this.dataPagamentoEsperado = dataPagamentoEsperado;
	}
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	public String getDataPagamentoEsperado() {
		return dataPagamentoEsperado;
	}
	public void setDataPagamentoEsperado(String dataPagamentoEsperado) {
		this.dataPagamentoEsperado = dataPagamentoEsperado;
	}
	
	public TipoDespesa getTipoDespesa() {
		return tipoDespesa;
	}
	public void setTipoDespesa(TipoDespesa tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}
	
	public Contas getConta() {
		return conta;
	}
	public void setConta(Contas conta) {
		this.conta = conta;
	}
	
	
	
	
	
	
	
}
