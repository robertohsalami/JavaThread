package br.com.alura.banheiro;

public class Banheiro {

	public void fazNumero1() {

		// Para pegar o nome do thread, basta acessar o thread atual
		// (Thread.currentThread()) e chamar o método getName(). Por exemplo, no método
		// fazNumero1():
		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		// Tudo que está dentro do bloco syncronized só poderá ser executado através de
		// um único thread. O synchronized(this) significa: "convidado, tente pegar a
		// chave do banheiro"! Sem a chave, o thread fica bloqueado, esperando a
		// liberação.
		synchronized (this) {
			System.out.println(nome + " entrando no banheiro");
			System.out.println(nome + " fazendo coisa rapida");

			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(nome + " dando a descaga");
			System.out.println(nome + " lavando a mao");
			System.out.println(nome + " saindo do banheiro");
		}

	}

	public void fazNumero2() {

		String nome = Thread.currentThread().getName();

		System.out.println(nome + " batendo na porta");

		// Tudo que está dentro do bloco syncronized só poderá ser executado através de
		// um único thread. O synchronized(this) significa: "convidado, tente pegar a
		// chave do banheiro"! Sem a chave, o thread fica bloqueado, esperando a
		// liberação.
		synchronized (this) {
			System.out.println(nome + " entrando no banheiro");
			System.out.println(nome + " fazendo coisa demorada");

			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(nome + " dando descarga");
			System.out.println(nome + " lavando a mao");
			System.out.println(nome + " saindo do banheiro");
		}

	}

}
