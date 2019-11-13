package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String RKaran = "You love the Seahawks! Good for you!";
String RCarson = "You are writing a novel! Sweet!";
String RDavid = "You are a mellow person! Far out!";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("What is your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if(name.equals("Carson")) {
JOptionPane.showMessageDialog(null, RCarson);	
}
if(name.equals("Karan")) {
JOptionPane.showMessageDialog(null, RKaran);	
}
if(name.equals("David")) {
JOptionPane.showMessageDialog(null, RDavid);	
}
}
	}


