package app;

import java.io.ObjectInputStream.GetField;

import br.com.banco.*;

public class App {
	
    public static void main(String[] args) throws Exception {

        Cliente cliente1 = new Cliente("Flavio", "Seixas", "12345678910");

        ContaCorrente conta1 = new ContaCorrente(cliente1, 1, "UFF", "03/01/2019");
        ContaPoupanca conta2 = new ContaPoupanca(cliente1, 1, "UFF", "03/01/2019");
        SegurodeVida seguro = new SegurodeVida(1, cliente1);
        
		conta1.depositar(1000); 
		conta2.depositar(1000);
		seguro.setValor(1000);
		
		//PRIMEIRA PARTE
		Tributavel a = (Tributavel) conta1;
		Tributavel b = (Tributavel) seguro;
		
		System.out.println(a.getTipo()+": "+a.getValorImposto());
		System.out.println(b.getTipo()+": "+b.getValorImposto());
		
		System.out.println();
		
		//SEGUNDA PARTE
		Ativo[] ativos = new Ativo[3];
		ativos[0] = conta1;
		ativos[1] = conta2;
		ativos[2] = seguro;
		
		for(int i = 0; i < ativos.length; i++) {
			System.out.print(ativos[i].getClass().getSimpleName()+": ");
			if (ativos[i] instanceof Tributavel) {
				System.out.println(((Tributavel) ativos[i]).getValorImposto());
			} else {
				System.out.println("Ativo não tributável!");
			}
		}
		
    }
    
}