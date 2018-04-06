package threads;

public class ThreadedReverseGreeting {
	public static void main(String[] args) {
		new Thread(() -> makeANew(50)).start();
	}
	// Write a program that creates a thread (Thread 1) that creates another thread
	// (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.

	private static void makeANew(int threads) {
		if (threads <= 0) {
			return;
		}
		System.out.println("Thread " + threads);
		new Thread(() -> makeANew(threads - 1)).start();
	}

}
