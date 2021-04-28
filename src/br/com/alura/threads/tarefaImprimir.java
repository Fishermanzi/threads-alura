package br.com.alura.threads;

public class tarefaImprimir implements Runnable {

	private Lista lista;

	public tarefaImprimir(Lista lista) {
		this.lista = lista;
	}

	@Override
	public void run() {
		synchronized (lista) {
			try {
				System.out.println("esperando, aguardando notificação...");
				lista.wait();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(i + " - " + lista.get(i));
			}
		}
	}

}
