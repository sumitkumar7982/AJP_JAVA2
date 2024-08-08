package github;

public class NumberPrinterSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread td = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				printNumbers();
			}
		});

		td.start();

		// Wait for the thread to finish
		try {
			td.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	// Method to print numbers from 0 to 4
	private static void printNumbers() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Finished printing numbers.");

	}
}
