package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {

		Robot James = new Robot();

		James.hide();
		James.moveTo(700, 360);
		James.penDown();
		James.setSpeed(10);
		for (int i = 0; true; i++) {
			James.setRandomPenColor();
			James.move(1 * i);
			James.turn(75);
			//James.setPenWidth(i);

		}
		
	}
}
