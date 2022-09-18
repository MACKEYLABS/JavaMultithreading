package cop2805c;

		class recursion extends Thread {
			public static int fibonacci(int n) {
				if (n == 0) return 0; 
				if (n == 1) return 1;
				return fibonacci(n-1) + fibonacci(n-2);
			    }
			public void run() {
				int x = fibonacci(40); 
				//long k = System.currentTimeMillis();
				//k = System.currentTimeMillis() - k;
				long startTime = System.currentTimeMillis();
				long endTime = System.currentTimeMillis();
				System.out.println("Recursion Thread Found the answer: " + x + " in " + (endTime - startTime) + "ms");
				try {
					sleep(100);
				} catch (InterruptedException e) {
				}

			}	
		}
		class dynamic extends Thread {
			public static int fibonacci(int n) {
			int v1 = 0, v2 = 1, v3 = 0;
			for (int i = 2; i <= n; i++); {
			v3 = v1 + v2;
			v1 = v2;
			v2 = v3;
			}
			return v3;
		}
			public void run() {
				int x = fibonacci(40);
				long k = System.currentTimeMillis();
				k = System.currentTimeMillis() - k;
				System.out.println("Dynamic Thread Found the answer: " + x + " in " + k + "ms");
				try {
					sleep(1000);
				} catch (InterruptedException e) {
				}

		}
		}
		public class Homework7 {
			public static void main(String[] args) {
			recursion r = new recursion(); 
			r.start();
			dynamic d = new dynamic();
			d.start(); 
		}
		}


