package br.com.alura.banco;

public class TarefaAcessarBancoProcedimento implements Runnable {
	
	private GerenciadorDeTransacao tx;
	private PoolDeConexao pool;
	
	public TarefaAcessarBancoProcedimento(PoolDeConexao pool,GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}
	@Override
	public void run() {
		synchronized (tx) {
			System.out.println("comecando a tx");
			tx.begin();
			
			synchronized (pool) {
				System.out.println("pegando a conexão");
				pool.getConnection();
			}
		}
	}

}
