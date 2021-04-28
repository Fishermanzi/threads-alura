package br.com.alura.threads;

public class TarefaAdicionarElemento implements Runnable {
	
	private Lista lista;
	private int threadNumero;
	private static int count = 0;
	
	public TarefaAdicionarElemento(Lista lista) {
		count++;
		this.lista = lista;
		this.threadNumero = count;
	}
	@Override
	public void run() {
		for(int i = 0; i < 100;i++) {
			lista.add(String.format("Thread %1$s - %2$s",threadNumero,i));
		}
	}

}
