package threads;

import java.util.Random;

public class BruteForceCracker {
	static long code = (long) (new Random().nextDouble() * 2_147_483_647);

	static long startTime;
	static long endTime;
	static float elapsedTime;

	public static void main(String[] args) {
		System.out.println("Starting Brute Force Checker");
		startTime = System.currentTimeMillis();

		int ctr = 0;
		// while (!checkCode(ctr++))
		// ;

		new Thread(() -> findCode(2147483647 / 4)).start();
		new Thread(() -> findCode(2147483647 / 4 * 2)).start();
		new Thread(() -> findCode(2147483647 / 4 * 3)).start();
		new Thread(() -> findCode(2147483647)).start();

		endTime = System.currentTimeMillis();
		elapsedTime = (float) (endTime - startTime);
		elapsedTime /= 1000f;
		System.out.println("Total time taken: " + elapsedTime + " seconds");
	}

	private static void findCode(long i) {
		for (long j = i - (2147483647 / 4); j < i; j++) {
			checkCode(j);
		}
	}

	public static boolean checkCode(long p) {
		// if (p % 10000000 == 0) {
		// System.out.println(p);
		// }

		if (p == code) {
			return true;
		} else {
			return false;
		}
	}
	// Below is a completed program that uses brute force to crack a 9-digit
	// password.
	// On average, the program takes about 0.125 seconds to find the password.
	// Your goal is to re-write the algorithm using Threads. Try to shorten the time
	// it takes
	// to find the code to be as little as possible.
	// Let's see who can crack the code the fastest!

	// Pro-tip: Do not include the creation of the threads as part of the time.

}
