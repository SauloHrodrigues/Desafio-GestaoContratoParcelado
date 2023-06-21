package servicos;

public interface PagamentosOnline {

	public Double calcularTaxa(Double valorParcela);
	public Double calcularJuros(Double valorOarcela, Integer qtdeTotalParcelas);
}
