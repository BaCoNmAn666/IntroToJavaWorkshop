package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class BetterSquare {
     public static void main(String[] args) {
		
    	 Robot Esme = new Robot("r2d2");
    	//1. Move the robot		
    
    	Esme.penDown();
    	Esme.setPenColor(0, 0, 255);
    	Esme.setSpeed(10);
    	for (int i = 0; i < 4; i++) {
			Esme.setRandomPenColor();
    		Esme.move(500);
			Esme.turn(270);
		}
    	Esme.setRandomPenColor();
    	Esme.hide();
    	Esme.move(250);
    	Esme.turn(270);
    	Esme.move(500);
    	Esme.turn(90);
    	Esme.move(250);
    	Esme.turn(90);
    	Esme.move(250);
    	Esme.turn(90);
    	Esme.move(500);
    	Esme.turn(90);
    	Esme.move(250);
    	Esme.turn(225);
    	Esme.move(355);
    	Esme.turn(225);
    	Esme.move(250);
    	Esme.turn(90);
    	Esme.move(245);
    	Esme.turn(135);
    	Esme.move(355);
	}
}
