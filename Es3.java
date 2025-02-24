package trd;
class Runn implements Runnable{
	private int numero;
	public Runn(int n) {
		numero=n;
	}
	public int fattoriale() {
		int res=1;
		for(int i=numero; i>0; i--) {
			res*=i;
			System.out.println(res);
		}
		return res;
	}
	public void run() {
		fattoriale();		
	}
	
}

public class Es3 {
	public static void main(String[] args) {
		Runn n= new Runn(10);
		Runn e= new Runn(8);
		n.run();
		e.run();
	}

}
