package com.financasApp.financas.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Receitas implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private double valor;
	private String dataRecebimento;
	private String dataRecebimentoEsperado;
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "tipoReceita",referencedColumnName = "id", nullable=false)
	private TipoReceita tipoReceita;
	
	@ManyToOne
	@JoinColumn(name = "conta",referencedColumnName = "id", nullable=false)
	private Contas conta;
	
	
	
	
	
	public Receitas() {
		super();
	}
	
	public Receitas(double valor, String dataRecebimento, String dataRecebimentoEsperado, String descricao) {
		super();
		this.valor = valor;
		this.dataRecebimento = dataRecebimento;
		this.dataRecebimentoEsperado = dataRecebimentoEsperado;
		this.descricao = descricao;
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
	
	public String getDataRecebimento() {
		return dataRecebimento;
	}
	public void setDataRecebimento(String dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	
	public String getDataRecebimentoEsperado() {
		return dataRecebimentoEsperado;
	}
	public void setDataRecebimentoEsperado(String dataRecebimentoEsperado) {
		this.dataRecebimentoEsperado = dataRecebimentoEsperado;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Contas getConta() {
		return conta;
	}
	public void setConta(Contas conta) {
		this.conta = conta;
	}
	
	public TipoReceita getTipoReceita() {
		return tipoReceita;
	}
	public void setTipoReceita(TipoReceita tipoReceita) {
		this.tipoReceita = tipoReceita;
	}
	
	
	
	
	
	
}
