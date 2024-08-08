package github;

public class NumberPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread td = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				printNumbers();
			}
		});
		
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

	// Method to print numbers from 0 to 4
	private static void printNumbers() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}
