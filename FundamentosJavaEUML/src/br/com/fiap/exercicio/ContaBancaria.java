package br.com.fiap.exercicio;

public class ContaBancaria {
	
	public ContaBancaria(String nomeCliente, String endCliente, String cpfCliente) {
		super(); // Chama construtor de Object
		this.nomeCliente= nomeCliente;
		this.endCliente= endCliente;
		this.cpfCliente= cpfCliente;
	}

	protected double saldo = 0;
	protected double valorDaTaxa = 1.0; // valor da taxa diaria
	protected String nomeCliente;
	protected String endCliente;
	protected String cpfCliente;

	public void saque(double valor) {
		saldo -= valor;
		System.out.println(saldo);
	}
	public void deposita(double valor) {
		saldo += valor;
		System.out.println(saldo);
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getTaxaBancaria() {
		return valorDaTaxa;
	}
	
	public double getTaxaBancaria(int dias) {
		return (getTaxaBancaria() * dias);
	}
	
	public double getTaxaBancaria(int dias, int meses) {
		return (getTaxaBancaria(meses * 30 + dias));
	}
	
	public double getTaxaBancaria(int dias, int meses, int anos) {
		return getTaxaBancaria((anos * 365)+ meses * 30 + dias);
	}

}
