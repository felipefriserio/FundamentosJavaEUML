package br.com.fiap.exercicio.constantes;

public enum ClassificacaoCliente {
	POTENCIAL(400000d,500000d),
	MEDIO(200000d,400000d),
	BAIXO(0d,199999d);

	private double valorInferior;
	private double valorSuperior;
	
	ClassificacaoCliente(double inferior, double superior){
		this.valorInferior = inferior;
		this.valorSuperior = superior;
	}
	
	public double getValorInferior() {
		return this.valorInferior;
	}
	public double getValorSuperior() {
		return this.valorSuperior;
	} 
}
