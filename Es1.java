package trd;

public class Es1 {
	public static void main(String[] args) {
		Thread numeri= new Thread(()->{
			for(int i=1; i <=10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
		});
		Thread lettere= new Thread(()->{
			for(char c= 'A'; c<='J'; c++) {
				System.out.println(c);
				try {
					Thread.sleep(700);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		numeri.start();
		lettere.start();
	}
}
