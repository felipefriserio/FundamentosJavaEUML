package br.com.fiap.exercicio;

import java.time.LocalDate;
import java.time.Period;

import br.com.fiap.exercicio.excecao.SaldoInsuficienteException;
import br.com.fiap.exercicio.excecao.SaldoNegativoException;

public class ContaPoupanca extends ContaBancaria{
	public ContaPoupanca(){}
	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente){
		super(nomeCliente, endCliente, cpfCliente);
	}
	
	public void saque(double valor) {
		if (this.saldo < valor)
			throw new SaldoInsuficienteException("Saldo "+this.saldo+" insuficiente para sacar "+ valor);
		if ((this.saldo) < 0)
			throw new SaldoNegativoException("Nao eh possivel sacar com saldo negativo");
		
		// conta com menos de 1 ano sera cobrado adicional de 1% do valor sacado 
		if (Period.between(this.dataCriacaoConta, LocalDate.now()).getYears() < 1)
			valor+=.01;
			
		saldo -= valor;
	}
	
	public boolean equals(ContaPoupanca cp2) {
		if (this.getCpfCliente().equals(cp2.getCpfCliente())) 
			return true;
		else 
			return false;
	}
	
}
