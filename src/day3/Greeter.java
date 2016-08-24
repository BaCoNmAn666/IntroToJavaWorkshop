package day3;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		String bro = JOptionPane.showInputDialog("What's your name?");
		JOptionPane.showMessageDialog(null, "Hello " + bro);
		JOptionPane.showMessageDialog(null, "Hail Cthulhu");
		JOptionPane.showMessageDialog(null, "You are ugly");
	}
}
