package br.com.fiap.exercicio;

public class ContaPoupanca extends ContaBancaria{

	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente){
		super(nomeCliente, endCliente, cpfCliente);
	}
	public ContaPoupanca() {}
	
	public boolean equals(ContaPoupanca cp2) {
		if (this.getCpfCliente().equals(cp2.getCpfCliente())) 
			return true;
		else 
			return false;
	}
	
}
