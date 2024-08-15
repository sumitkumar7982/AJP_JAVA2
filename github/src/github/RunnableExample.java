package github;

class MyRunnable implements Runnable {
	@Override
	public void run() {
// Code to be executed in the thread
		System.out.println("Thread is running.");
	}
}

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable myrun = new MyRunnable();
		Thread th = new Thread(myrun);
		th.start();
		// The main thread continues running concurrently with the new thread
		System.out.println("Main thread is running.");
	}

}
