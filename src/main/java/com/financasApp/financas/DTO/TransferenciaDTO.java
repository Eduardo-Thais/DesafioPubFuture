package com.financasApp.financas.DTO;

public class TransferenciaDTO {
	private String instituicaoOrigem;
	private String instituicaoDestino;
	private double quantia;
	
	
	
	
	
	public TransferenciaDTO() {
		super();
	}
	
	public TransferenciaDTO(String instituicaoOrigem, String instituicaoDestino, double quantia) {
		super();
		this.instituicaoOrigem = instituicaoOrigem;
		this.instituicaoDestino = instituicaoDestino;
		this.quantia = quantia;
	}
	
	
	public String getInstituicaoOrigem() {
		return instituicaoOrigem;
	}
	public void setInstituicaoOrigem(String instituicaoOrigem) {
		this.instituicaoOrigem = instituicaoOrigem;
	}
	
	public String getInstituicaoDestino() {
		return instituicaoDestino;
	}
	public void setInstituicaoDestino(String instituicaoDestino) {
		this.instituicaoDestino = instituicaoDestino;
	}
	
	public double getQuantia() {
		return quantia;
	}
	public void setQuantia(double quantia) {
		this.quantia = quantia;
	}
	
	
	

	
	
	
}