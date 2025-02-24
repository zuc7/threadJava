package trd;

public class Esempio2{
	public static void main(String[] args) throws InterruptedException {
		Saluti s= new Saluti("n di n");
		Saluti e= new Saluti("egro");
		s.start();
		s.join(); //aspetta la fine del thread per cominciare il resto
		e.start();
		e.join();
		System.out.println("FINITO");
	}
}
