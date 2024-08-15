package github;

//creating Accounts class with data member balance 20000
class Accounts {
	int balance = 20000;

//created synchronized withdraw () method which will withdraw the amount
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw " + amount + " rs.");
		if (balance < amount) {
			System.out.println("insufficient balance!!waiting for deposit....");
			try {
				wait(); // waiting thread to notify
			} catch (Exception e) {
//TODO: handle exception
			}
			this.balance -= amount;
			System.out.println("withdraw done");
		}
	}

//created synchronized deposit() method which will withdraw the amount
	synchronized void deposit(int amount) {
		System.out.println(amount + " going to deposit");
		this.balance += amount;
		System.out.println("deposit done");
		notify(); // notifying withdraw() method which is waiting for
	}
}

public class interThreadCommunicationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accounts acc = new Accounts();// lock is associated with acc object.
		// created two anonymous thread object to call withdraw() and deposit()method
		new Thread() {
			public void run() {
				acc.withdraw(30000);
			}
		}.start();
		new Thread() {
			public void run() {
				acc.deposit(30000);
			}
		}.start();

	}

}
