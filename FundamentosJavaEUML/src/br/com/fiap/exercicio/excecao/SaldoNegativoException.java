package br.com.fiap.exercicio.excecao;

public class SaldoNegativoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SaldoNegativoException(String mensagem){
		super(mensagem);
	}
}
