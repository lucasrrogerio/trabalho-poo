package br.com.banco;

/**
 * Seguro de Vida
 */
public class SegurodeVida implements Tributavel {

	private int apolice;
	private Cliente titular;
	private double valor;
	
	public SegurodeVida(int apolice, Cliente titular) {
		this.apolice = apolice;
		this.titular = titular;
		this.valor = 0;
	}

	public int getApolice() {
		return apolice;
	}

	public void setApolice(int apolice) {
		this.apolice = apolice;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getValorImposto() {
		return (500f)+(this.getValor()*2/100);
	}

	public String getTitular() {
		return this.titular.toString();
	}
	
	public String getTipo() {
		return this.getTipo();
	}
	
}
