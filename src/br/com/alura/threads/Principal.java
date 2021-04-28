package br.com.alura.threads;

public class Principal {

	public static void main(String[] args) {
		Lista lista = new Lista(1000);
		
		for(int i = 0; i < 10; i++) {
			new Thread(new TarefaAdicionarElemento(lista)).start();
		}
		new Thread(new tarefaImprimir(lista)).start();
	}

}
