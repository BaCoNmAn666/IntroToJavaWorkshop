package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {

		String cool = "yes";
		
		// 1. Ask the user if they know how to write code.
		cool = JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (cool.equalsIgnoreCase("yes")) {
			System.out.println("You will rule the world");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else {
		
			System.out.println("Good luck washing dishes");
		}

	}
}
