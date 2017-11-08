package br.com.fiap.exercicio;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteCollections {

	
	public static void main(String[] args) {
		long loop     = 9999999;
		String string = "Tobias";
		
		new ContaBancaria().toString();
		
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		
		// mede tempo de insercao 
		LocalDateTime tempoInsercaoArray = LocalDateTime.now();
		for (long i = 0; i < loop; i++) {
			arrayList.add(new String(string));
			//arrayList.add(string);
		}
		System.out.println("Tempo para adicionar array list: "+(ChronoUnit.MILLIS.between(tempoInsercaoArray, LocalDateTime.now())+" (em ms)"));
		
		LocalDateTime tempoInsercaoLinked = LocalDateTime.now();
		for (long i = 0; i < loop; i++) {
			linkedList.add(new String(string));
			//linkedList.add(string);
		}
		System.out.println("Tempo para adicionar linked list: "+(ChronoUnit.MILLIS.between(tempoInsercaoLinked, LocalDateTime.now())+" (em ms)"));
		
		// mede tempo para acessar posicao  
		LocalDateTime tempoAcessoArray = LocalDateTime.now();
		arrayList.get(5000000);
		System.out.println("Tempo para acessar array list: "+(ChronoUnit.MILLIS.between(tempoAcessoArray, LocalDateTime.now())+" (em ms)"));

		LocalDateTime tempoAcessoLinked = LocalDateTime.now();
		linkedList.get(5000000);
		System.out.println("Tempo para acessar linked list: "+(ChronoUnit.MILLIS.between(tempoAcessoLinked, LocalDateTime.now())+" (em ms)"));
	}
}
