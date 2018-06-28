//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nick = JOptionPane.showInputDialog("How many nickels you got?");
		// Convert their answer to an int using Integer.parseInt()
		int val = Integer.parseInt(nick);
		// Ask the user how many dimes they have, and convert their answer
		String dime = JOptionPane.showInputDialog("How many dimes you got?");
		int va = Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
		String quar = JOptionPane.showInputDialog("How many quarters you got?");
		int v = Integer.parseInt(quar);
		// Calculate how much money the user has and save it in a double variable 
		double mon = val*0.05 + va*0.1 + v*0.25;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have " + mon + "$.");
	}
}

