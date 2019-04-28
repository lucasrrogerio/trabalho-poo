package br.com.banco;

/**
 * Cliente
 */
public class Cliente {

	private String primeiroNome;
    private String ultimoNome;
    private String cpf;

    public Cliente(String primeiroNome, String ultimoNome, String cpf) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.cpf = cpf;
    }

    public String getPrimeiroNome() {
		return this.primeiroNome;
	}

	public String getUltimoNome() {
		return this.ultimoNome;
	}

	public String getCpf() {
		return this.cpf;
	}
	
	public String toString() {
		return this.primeiroNome+" "+this.ultimoNome+" - "+this.cpf;
	}
    
}