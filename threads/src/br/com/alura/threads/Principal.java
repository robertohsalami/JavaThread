package br.com.alura.threads;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread MAIN");
		//Como esse programinha acaba muito rápido, vamos pedir para a máquina virtual mandar aquele thread dormir! 
		//Como? Muito fácil, através do método estático Thread.sleep():
		//vai demorar 50 segundos pra ser encerrado.
		Thread.sleep(50000);

	}

}
