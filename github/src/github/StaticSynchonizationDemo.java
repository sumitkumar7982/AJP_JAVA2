package github;

class Product {
	// creating printProduct() method which will print the product of n
	synchronized static void printProduct(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName() + ": " + n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class StaticSynchonizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread("t1") {
			public void run() {
				Product.printProduct(2);
			}
		}.start();
		new Thread("t2") {
			public void run() {
				Product.printProduct(5);
			}
		}.start();
		new Thread("t3") {
			public void run() {
				Product.printProduct(6);
			}
		}.start();
		new Thread("t4") {
			public void run() {
				Product.printProduct(8);
			}
		}.start();

	}

}
