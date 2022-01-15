package com.financasApp.financas.DTO;

public class TransferenciaDTO {
	private Long idOrigem;
	private Long idDestino;
	private double quantia;
	
	
	
	
	
	public TransferenciaDTO() {
		super();
	}
	
	
	
	public TransferenciaDTO(Long idOrigem, Long idDestino, double quantia) {
		super();
		this.idOrigem = idOrigem;
		this.idDestino = idDestino;
		this.quantia = quantia;
	}



	public Long getIdOrigem() {
		return idOrigem;
	}



	public void setIdOrigem(Long idOrigem) {
		this.idOrigem = idOrigem;
	}



	public Long getIdDestino() {
		return idDestino;
	}



	public void setIdDestino(Long idDestino) {
		this.idDestino = idDestino;
	}



	public double getQuantia() {
		return quantia;
	}
	public void setQuantia(double quantia) {
		this.quantia = quantia;
	}
	
	
	

	
	
	
}