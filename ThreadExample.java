package cop2805;

public class ThreadExample extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Thread: " + i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
	public static void main(String[] args) {
		(new ThreadExample()).start();
		for(int i=1; i<= 20;i++)
		{
			System.out.println("Main function: " + i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
//int fibonacci(int n)
//if(n == 0) return 0
//if(n == 1) return 1
//return fibonacci(n-1) + fibonacci(n-2)

