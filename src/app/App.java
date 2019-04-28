package app;

import br.com.banco.*;

public class App {
	
    public static void main(String[] args) throws Exception {

        Cliente cliente1 = new Cliente("Flavio", "Seixas", "12345678910");

        Conta conta1 = new ContaCorrente(cliente1, 1, "UFF", "03/01/2019");
        Conta conta2 = new ContaPoupanca(cliente1, 1, "UFF", "03/01/2019");
        SegurodeVida seguro = new SegurodeVida(1, cliente1);
        
		conta1.depositar(1000); 
		conta2.depositar(1000);
		seguro.setValor(1000);
		
		Tributavel a = (Tributavel) conta1;
		Tributavel c = (Tributavel) seguro;
		
		System.out.println(a.getValorImposto());
		System.out.println(c.getValorImposto());

    }
    
}