package br.com.fiap.exercicio;

public class ContaEspecial extends ContaBancaria {
	
	public ContaEspecial(String nomeCliente, String endCliente, String cpfCliente) {
		super(nomeCliente, endCliente, cpfCliente);
	}

	public void saque(double valor) {
		super.saque(valor*.9);
	}
	
	public void deposita(double valor) {
		super.deposita(valor * .9);
	}
}
