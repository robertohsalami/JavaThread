package br.com.alura.threads;

public class PrincipalExercicio {

	public static void main(String[] args) {
		//O nome deve ser uma expressão regular agora, por exemplo procurando nomes que começam com Dan ou Chad
		/*
		 * \\s - significa whitespace, um espaço ou tab
		 * \\w - significa word, um caractere ou número
		 * */
		String nomeAProcurar = "(Dan|Chad)(\\s|\\w)*";
		
		Thread arquivo = new Thread(new TarefaBusca("assinaturas1.txt", nomeAProcurar));
		Thread arquivo2 = new Thread(new TarefaBusca("assinaturas2.txt", nomeAProcurar));
		Thread arquivo3 = new Thread(new TarefaBusca("autores.txt", nomeAProcurar));
		
		arquivo.start();
		arquivo2.start();
		arquivo3.start();

	}

}
