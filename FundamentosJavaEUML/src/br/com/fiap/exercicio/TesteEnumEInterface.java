package br.com.fiap.exercicio;

import br.com.fiap.exercicio.constantes.ClassificacaoCliente;

public class TesteEnumEInterface implements VerificaCompatibilidade{
	public static void main(String[] args) {
		ContaPoupanca conta1 = new ContaPoupanca("Jose", "Rua x", "123456");
		ContaPoupanca conta2 = new ContaPoupanca("Maria", "Rua y", "123888");
		ContaPoupanca conta3 = new ContaPoupanca("Tobias", "Rua w", "18778");
		
		conta1.setSaldo(100000);
		conta2.setSaldo(250000);
		conta3.setSaldo(800000);
		
		if (verificaCompatibilidadeComContaBancaria(conta1))
			classificacaoCliente(conta1.getSaldo());
		
		if (verificaCompatibilidadeComContaBancaria(conta2))
			classificacaoCliente(conta2.getSaldo());
		
		if (verificaCompatibilidadeComContaBancaria(conta3))
			classificacaoCliente(conta3.getSaldo());
		
		verificaCompatibilidadeComContaBancaria(new Integer(5));
	}
	
	private static boolean verificaCompatibilidadeComContaBancaria(Object objeto) {
		if (objeto instanceof ContaBancaria) {
			System.out.println("Compativel com Conta Bancaria");
			return true;
		}	
		System.out.println("> Objeto nao compativel com Conta Bancaria");
		return false;
	}
	
	private static void classificacaoCliente(double saldo){
		if (saldo <= ClassificacaoCliente.BAIXO.getValorSuperior())
			System.out.println(ClassificacaoCliente.BAIXO.toString());
		else if (saldo >= ClassificacaoCliente.MEDIO.getValorInferior() && saldo <= ClassificacaoCliente.MEDIO.getValorSuperior()) 
			System.out.println(ClassificacaoCliente.MEDIO.toString());
		else if (saldo >= ClassificacaoCliente.POTENCIAL.getValorSuperior()) 
			System.out.println(ClassificacaoCliente.POTENCIAL.toString());
		else 
			System.out.println("Erro");
	} 
}
