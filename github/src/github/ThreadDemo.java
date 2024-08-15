package github;

public class ThreadDemo extends Thread {
	// Using constructor to name the thread
	public ThreadDemo(String name) {
		super(name);
	}

	// here we are running loop from 1 to 5 to display from 1 to 5
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(500); // invoking sleep() method for context switching between two thread
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			// Displaying values of “i” with the name of thread
			System.out.println("Thread: " + Thread.currentThread().getName() + " :" + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1 = new ThreadDemo("S1");
		ThreadDemo t2 = new ThreadDemo("S2");
		ThreadDemo t3 = new ThreadDemo("S3");
		t1.start();
		try {
			t1.join();// Calling join() method by t1 so that t2 and t3 will wait for this thread “t1”
						// to die
		} catch (Exception e) {
		}
		// After t1 then we are starting t2 and t3
		t2.start();
		t3.start();
	}

}
