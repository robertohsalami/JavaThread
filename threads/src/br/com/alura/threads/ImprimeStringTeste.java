package br.com.alura.threads;

public class ImprimeStringTeste {

	public static void main(String[] args) {
		Runnable imprimeString = new ImprimeString();
		Thread thread = new Thread(imprimeString, "Imprime String");
		thread.start();
	}

}
