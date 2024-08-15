package github;

class Factorial {
//here we have created synchronized method fact() which will calculate factorial
	synchronized void fact(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
			System.out.println("Thread: " + Thread.currentThread().getName() + ": " + f);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("Factorial of " + n + " is:" + f);
	}
}

public class SyncronizationMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial fact = new Factorial();
		
		new Thread(){
			public void run() {
				fact.fact(5);
			}
		}.start();
		
		new Thread(){
			public void run() {
				fact.fact(10);
			}
		}.start();

	}

}
