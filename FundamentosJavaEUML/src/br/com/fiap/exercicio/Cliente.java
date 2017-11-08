package br.com.fiap.exercicio;

import java.time.LocalDate;

public class Cliente{
	Cliente(String nome, int idade, boolean ativo, LocalDate data){}
	
	private String nome;
	private int idade;
	private boolean ativo;
	private LocalDate dataPrimeiraCompra;
	
	public String toString(Cliente c) {
		return "nome: "+c.getNome()+
			   " idade: "+c.getIdade()+
			   " ativo: "+c.isAtivo()+
			   " primeiraCompra :" + c.getDataPrimeiraCompra(); 
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public LocalDate getDataPrimeiraCompra() {
		return dataPrimeiraCompra;
	}
	public void setDataPrimeiraCompra(LocalDate dataPrimeiraCompra) {
		this.dataPrimeiraCompra = dataPrimeiraCompra;
	}
}
