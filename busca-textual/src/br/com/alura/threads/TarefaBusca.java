package br.com.alura.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBusca implements Runnable {

	private String nomeArquivo;
	private String nomeAProcurar;

	public TarefaBusca(String nomeArquivo, String nomeAProcurar) {
		this.nomeArquivo = nomeArquivo;
		this.nomeAProcurar = nomeAProcurar;
	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new File(nomeArquivo));
			
			int numeroLinha = 1;
			
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				
				//Em vez de chamar o m�todo contains da classe String podemos usar o m�todos matches que recebe a express�o regular:
				if(linha.matches(nomeAProcurar)) {
					System.out.println(nomeArquivo + " - " + numeroLinha + " - " + linha);					
				}
				numeroLinha++;
			}
			scanner.close();
		} catch (FileNotFoundException e) {			
			throw new RuntimeException(e);
		}

	}

}
