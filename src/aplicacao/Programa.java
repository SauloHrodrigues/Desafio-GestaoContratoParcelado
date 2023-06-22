package aplicacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

import entidades.Contrato;
import entidades.Prestacao;
import servicos.GestaoContrato;
import servicos.PaypalSevice;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Entre com os dados do contrato a ser calculado:");
		System.out.print("Número: ");
		int numeroContrato = input.nextInt();
		System.out.print("Data: ");
		LocalDate dataContrato = LocalDate.parse(input.next(), fmt);
		System.out.print("Valor: ");
		Double valorContrato = input.nextDouble();
		Contrato contrato = new Contrato(numeroContrato, dataContrato, valorContrato);
		System.out.print("Entre com o número de parcela: ");
		Integer qtdeParcelas = input.nextInt();
		GestaoContrato gC = new GestaoContrato(new PaypalSevice());
		gC.processaContrato(contrato, qtdeParcelas);
		System.out.println("Parcelas:");
		
		for(Prestacao parcela: contrato.getParcela() ) {
			System.out.println(parcela);
		}
		
		
		input.close();

	}

}
