package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {

			Robot apple = new Robot("mini");
		
			apple.penDown();
		// 8. Make the robot go at maximum speed (10)
			apple.setSpeed(10);
			
			for (int i = 0; true; i++) {
				
			
		
				apple.setPenColor(0, 0, 0);
		
		int sides = 5;
	
		int angle = 360/sides;
		

			
	apple.move(i);
	
	
			
			apple.turn(angle);
	
			apple.turn(1);
	}
	}
	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}