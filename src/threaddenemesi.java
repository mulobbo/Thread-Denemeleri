
public class threaddenemesi {

	public static class threadloop extends Thread {

		@Override
		public void run() {

			int i = 0;

			while (true) {
				i++;

			if (i % 10000 == 0) {
					System.out.println(Thread.currentThread().getName() + " - " + i);
				}

				

			}

		}

	}
	
	public static void main(String[] args) {
		new threadloop().start();
		new threadloop().start();
		new threadloop().start();
		new threadloop().start();
		

	}
	

}
