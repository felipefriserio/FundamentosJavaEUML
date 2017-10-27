package br.com.fiap.exercicio;

public class TesteEquals {
	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca("Maria", "Rua a", "123");
		
		System.out.println(new ContaPoupanca("Maria", "Rua a", "123").equals(cp));
		System.out.println(new ContaPoupanca("Maria", "Rua a", "000").equals(cp));
		
		System.out.println((cp == new ContaPoupanca("Maria", "Rua a", "123") ? true : false));
		
	}
}
