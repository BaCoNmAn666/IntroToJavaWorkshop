package day3;

import javax.swing.JOptionPane;

public class STALKER {

	public static void main(String[] args) {
		String pin = JOptionPane.showInputDialog("What's your phone pin?");
		String pas = JOptionPane.showInputDialog("Whats your email password?");
		String adr = JOptionPane.showInputDialog("What's your address?");
		JOptionPane.showMessageDialog(null, "Your pin is " + pin + ", your email password is " + pas + " and your address is " + adr + ".  You shouldn't have given me that info you f***ing idiot");
	}
}
