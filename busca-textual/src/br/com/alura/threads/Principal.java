package br.com.alura.threads;

public class Principal {
	
	public static void main(String[] args) {
		//vamos declarar o nome que queremos procurar
		String nomeProcurado = "be";
		
		//Pesquisando paralelamente. Criar para cada arquivo um novo Thread.
		Thread threadAutores = new Thread(new TarefaBuscaNome("autores.txt", nomeProcurado));
		Thread threadAssinaturas1 = new Thread(new TarefaBuscaNome("assinaturas1.txt", nomeProcurado));
		Thread threadAssinaturas2 = new Thread(new TarefaBuscaNome("assinaturas2.txt", nomeProcurado));
		
		//iniciando as threads
		threadAutores.start();
		threadAssinaturas1.start();
		threadAssinaturas2.start();
	}

}
