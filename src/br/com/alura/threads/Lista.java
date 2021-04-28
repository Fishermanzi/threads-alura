package br.com.alura.threads;

public class Lista {
	private Object[] elementos;
	private int index;
	private int size;

	public Lista(int size) {
		this.size = size;
		elementos = new Object[size];
		index = 0;
	}

	public synchronized void add(Object obj) {
		elementos[index] = obj;
		this.index++;
		
		Sleep.sleep(10);
		
		if (this.index == this.size()) {
            System.out.println(index + " lista tá cheia, notificando");
            this.notify();
        }
	}

	public int size() {
		return size;
	}

	public Object get(int i) {
		return elementos[i];
	}

	public void replace(int i, Object obj) {
		elementos[i] = obj;
	}
}
