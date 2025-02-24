package trd;

class Saluti extends Thread{
	public Saluti(String nome) {
		super(nome);
	}
	public void run() {
		for(int i=1; i <=10; i++) {
			System.out.println("Ciao da "+ getName()+ "   "+i);
		}
	}	
}
public class EsempioT{
	public static void main(String[] args) {
		Saluti s= new Saluti("n di n");
		s.start();
	}
}
