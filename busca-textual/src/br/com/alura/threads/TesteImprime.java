package br.com.alura.threads;

public class TesteImprime {

	public static void main(String[] args) {
		new Thread(new ImprimeUmAteMil ()).start();
        new Thread(new ImprimeUmAteMil ()).start();
	}

}
