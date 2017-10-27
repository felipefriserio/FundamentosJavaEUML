package br.com.fiap.exercicio;

public class Teste {
		private static final ContaBancaria c  = new ContaBancaria("Maria", "Rua Y", "456");
		private static final ContaEspecial ce = new ContaEspecial("Maria", "Rua Y", "456");
	
	
		public static void main(String[] args) {
			// private static final CONTA = new Conta(); -- o que sera imutavel eh a referencia, e nao o objeto
			System.out.println("A taxa é de: R$" + new ContaBancaria("Jose","Rua X", "123").getTaxaBancaria());
			System.out.println("A taxa é de: R$" + new ContaBancaria("Jose","Rua X", "123").getTaxaBancaria(5));
			System.out.println("A taxa é de: R$" + new ContaEspecial("Jose","Rua X", "123").getTaxaBancaria(5,2));
			
			new ContaBancaria("Jose","Rua X", "123").deposita(1000);
			new ContaBancaria("Jose","Rua X", "123").saque(1000);

			new ContaEspecial("Jose","Rua X", "123").deposita(1000);
			new ContaEspecial("Jose","Rua X", "123").saque(1000);
			
			/*INSTANCE OF*/
			if (c instanceof ContaBancaria)
				System.out.println("Eh uma instancia de Conta");
			if (ce instanceof ContaBancaria) // Classe que estende tbm eh uma da classe mae 
				System.out.println("Eh uma instancia de Conta");
			
			/*TESTE COM OPERADORES*/
			int a = 1;
			int b = 2;
			
			System.out.println(a+++b);
			System.out.println(+a+b);
			System.out.println(++a+b);
			
			
			/*exercicio convertendo para binario*/
			String sbin = "";
			int num = 12;
			int resto = -1;
			do {
				resto = num %2;
				num /= 2;
				sbin = resto+sbin;
				System.out.println(sbin);
				
			} while (num != 0);
			
			// forma 2 de se fazer
			System.out.println(Integer.toString(12,2));
			
			
			Object[] objArray = {"Teste1","Teste2",5, new ContaBancaria("Maria", "Rua W", "123")};
			
			byte[] byteArray = {-127};
			byte soma = 0;
			byte min  = 127;
			byte max  = -128;
			
			for(byte i: byteArray) {
				soma += i;
				min = (i < min) ? min = i : min;
				max = (i > max) ? max = i : max;
			}
			
			System.out.println("A Soma eh: "+ soma);
			System.out.println("O min eh: "+ min);
			System.out.println("O max eh: "+ max);
			System.out.println("A media eh: "+ (double) soma / byteArray.length);
			
			
			
			/* Exemplo de agregacao --- Materia <-> Aluno       (um pode existir sem o outro) 
			 * Exemplo de composicao --- Aluno  <-> Matricula   (um nao existe sem o outro)
			 * */
			
			
			/*
			 * comparando == de tipos primitivos compara valor do obj
			 * comparando == com objetos complexos compara a referencia
			 * */
			
		}

}
