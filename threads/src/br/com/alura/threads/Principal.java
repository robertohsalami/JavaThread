package br.com.alura.threads;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread MAIN");
		//Como esse programinha acaba muito r�pido, vamos pedir para a m�quina virtual mandar aquele thread dormir! 
		//Como? Muito f�cil, atrav�s do m�todo est�tico Thread.sleep():
		//vai demorar 50 segundos pra ser encerrado.
		Thread.sleep(50000);

	}

}
