package github;

class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is running.");
		synchronized (ThreadStateExample.class) {
			try {
				Thread.sleep(2000);
				ThreadStateExample.class.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread is awake.");
	}
}

public class ThreadStateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new MyThread1();
		System.out.println("Thread State: " + thread.getState()); // NEW
		thread.start();
		System.out.println("Thread State: " + thread.getState()); // RUNNABLE
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread State: " + thread.getState()); // TIMED_WAITING
		synchronized (ThreadStateExample.class) {
			ThreadStateExample.class.notify();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread State: " + thread.getState()); // TERMINATED

	}

}
