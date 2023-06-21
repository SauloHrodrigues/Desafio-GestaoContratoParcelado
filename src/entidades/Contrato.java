package entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
	private Integer numeroContrato;
	private LocalDate dataContrato;
	private Double valorTotalContrato;
	private List<Prestacao> parcela = new ArrayList<>();
	
	//construtores
	public Contrato() {
		
	}
	
	public Contrato(Integer numeroContrato, LocalDate dataContrato, Double valorTotalContrato) {
	
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorTotalContrato = valorTotalContrato;
	}

	
	// getters e setters
	
	public int getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public LocalDate getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(LocalDate dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorTotalContrato() {
		return valorTotalContrato;
	}

	public void setValorTotalContrato(Double valorTotalContrato) {
		this.valorTotalContrato = valorTotalContrato;
	}

	public List<Prestacao> getParcela() {
		return parcela;
	}
	
}
