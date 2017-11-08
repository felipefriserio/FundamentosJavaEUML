package br.com.fiap.exercicio;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteStreamsLambda {
	
	public static void main(String[] args){
		List<Cliente> listaDeClientes = new ArrayList<Cliente>();
		
		listaDeClientes.add(new Cliente("Tobias",   26,  true, LocalDate.of(2015, 1, 15)));
		listaDeClientes.add(new Cliente("Maria",    30,  true, LocalDate.of(2012, 1, 15)));
		listaDeClientes.add(new Cliente("Jose",     15,  true, LocalDate.of(2015, 1, 15)));
		listaDeClientes.add(new Cliente("Serafim",  85,  true, LocalDate.of(1978, 1, 15)));
		listaDeClientes.add(new Cliente("Cid",  	115, true, LocalDate.of(2000, 1, 15)));
		
		// atualiza clientes para inativos que ultima data de compra > 5 anos 
		// listaDeClientes.stream().mapToInt(Cliente::getDataPrimeiraCompra) > 5;
		
		
		
	}
}
