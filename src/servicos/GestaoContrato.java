package servicos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import entidades.Contrato;
import entidades.Prestacao;

public class GestaoContrato {

	private PagamentosOnline pagamentoOnline;

	public GestaoContrato(PagamentosOnline pagamentoOnline) {
		this.pagamentoOnline = pagamentoOnline;
	}
	
	public void processaContrato(Contrato contrato, Integer qtdeParcelas) {
		Double parcelaBase = contrato.getValorTotalContrato()/qtdeParcelas;
		
		for(int i = 1; i <= qtdeParcelas; i++) {
			LocalDate data = contrato.getDataContrato().plusMonths(i);
			Double juros = pagamentoOnline.calcularJuros(parcelaBase, i);
			Double taxa = pagamentoOnline.calcularTaxa(parcelaBase+juros);
			Double valorPrestacao= parcelaBase+juros+taxa;
			contrato.getParcela().add(new Prestacao(data, valorPrestacao ));
		}
		
	}
	
}
