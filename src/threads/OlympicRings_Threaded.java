package threads;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot ae = new Robot(1000, 400);
		Robot bea = new Robot(1000, 500);
		Robot sie = new Robot(500, 500);
		Robot dei = new Robot(500, 400);
		new Thread(() -> {
			ae.setSpeed(100000000);
			ae.penDown();
			for (int i = 0; i < 360; i++) {
				ae.move(5);
				ae.turn(1);
			}
		}).start();
		new Thread(() -> {
			bea.setSpeed(100000000);
			bea.penDown();
			for (int i = 0; i < 360; i++) {
				bea.move(5);
				bea.turn(1);
			}
		}).start();
		new Thread(() -> {
			sie.setSpeed(100000000);
			sie.penDown();
			for (int i = 0; i < 360; i++) {
				sie.move(5);
				sie.turn(1);
			}
		}).start();
		new Thread(() -> {
			dei.setSpeed(100000000);
			dei.penDown();
			for (int i = 0; i < 360; i++) {
				dei.move(5);
				dei.turn(1);
			}
		}).start();
	}
}
