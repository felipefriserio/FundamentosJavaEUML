package br.com.fiap.exercicio;

import java.time.LocalDate;

import br.com.fiap.exercicio.excecao.SaldoInsuficienteException;
import br.com.fiap.exercicio.excecao.SaldoNegativoException;

public class TesteContaPoupanca {
	
	public static void main(String[] args) {
		try {
			// verifica se conta tem mais de 1 ano 
			ContaPoupanca cp = new ContaPoupanca("Felipe","Rua x", "123");
			cp.setDataCriacaoConta(LocalDate.now());
			cp.setSaldo(600);
			cp.saque(500);
			 
			ContaPoupanca cp2 = new ContaPoupanca("Maria","Rua x", "123");
			cp2.setDataCriacaoConta(LocalDate.of(2005,1,20));
			cp2.setSaldo(600);
			cp2.saque(500);
			
			System.out.println(cp.getSaldo());
			System.out.println(cp2.getSaldo());
			
			//excecoes
			ContaPoupanca cp3 = new ContaPoupanca("Felipe","Rua x", "123");
			cp3.setSaldo(5);
			cp3.saque(10);
			
		} catch (SaldoInsuficienteException  e) {
			e.printStackTrace();
		} catch (SaldoNegativoException  e) {
			e.printStackTrace();
		}
	
	}

}
