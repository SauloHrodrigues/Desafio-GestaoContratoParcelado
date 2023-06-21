package servicos;

public class PaypalSevice implements PagamentosOnline {

	@Override
	public Double calcularTaxa(Double valorParcela) {
		return valorParcela*0.02;
	}

	@Override
	public Double calcularJuros(Double valorParcela, Integer parcela) {
		
		return (valorParcela * parcela)/100;
	}

}
