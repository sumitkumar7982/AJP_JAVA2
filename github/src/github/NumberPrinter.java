package github;

class Numbers extends Thread{
	@Override
	public void run() {
	// Code to be executed in the thread
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}

public class NumberPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Numbers td = new Numbers();
		
		// Start the thread
		td.start();

		// Wait for the thread to finish
		try {
			td.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Finished printing numbers.");
	}

	
}
