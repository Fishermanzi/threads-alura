package br.com.alura.threads;

public interface Sleep {
	public static void sleep(long time) {
		try{
            Thread.sleep(time);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
	}
}
