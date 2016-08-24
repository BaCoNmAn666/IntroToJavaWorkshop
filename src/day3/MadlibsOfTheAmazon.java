package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String ad = JOptionPane.showInputDialog("Adjective");
		// Get the user to enter a type of liquid
		String body = JOptionPane.showInputDialog("Body part");
		// Get the user to enter a body part
		String liquid = JOptionPane.showInputDialog("Type of Liquid");
		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog("Verb");
		// Get the user to enter a place
		String place = JOptionPane.showInputDialog("Place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		JOptionPane.showMessageDialog(null, "Piranhas are more " + ad + " during the day, so cross during the night.");
		JOptionPane.showMessageDialog(null, "Piranhas are atraccted to fresh " + liquid + " and will most likely take a bite out of your " + body + " if you're " + verb + ".");
		JOptionPane.showMessageDialog(null, "Whatever you do, if you have a open wound, try to find another way to get back to the " + place + ".");
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

