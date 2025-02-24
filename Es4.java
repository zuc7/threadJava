package trd;

public class Es4 {
	public static void main(String[] args) {
		Thread numeri= new Thread(()->{
			for(int i=1; i <=5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
		});
		Thread lettere= new Thread(()->{
			for(char c= 'a'; c<='e'; c++) {
				System.out.println(c);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		numeri.setPriority(10);;
		lettere.setPriority(1);
		numeri.start();
		lettere.start();
	}
}
