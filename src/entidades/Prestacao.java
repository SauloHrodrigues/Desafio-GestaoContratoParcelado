package entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Prestacao {
	private LocalDate dataPrestacao;
	private Double valorPrestacao;
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Prestacao( LocalDate dataPrestacao, Double valorPrestacao) {
		this.dataPrestacao = dataPrestacao;
		this.valorPrestacao = valorPrestacao;
	}

	public LocalDate getDataPrestacao() {
		return dataPrestacao;
	}

	public void setDataPrestacao(LocalDate dataPrestacao) {
		this.dataPrestacao = dataPrestacao;
	}

	public Double getValorPrestacao() {
		return valorPrestacao;
	}

	public void setValorPrestacao(Double valorPrestacao) {
		this.valorPrestacao = valorPrestacao;
	}

	@Override
	public String toString() {
		return  dataPrestacao.format(fmt) + " - " + String.format("%.2f", valorPrestacao);
	}
	
	

}
