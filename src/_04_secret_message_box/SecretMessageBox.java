package _04_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;



public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		
	
	// 1. Set a password in a String variable
	String passcode = "Koalanoise";
	// 2. Using a pop-up, ask the first person for a secret message and store it in a variable
String input = JOptionPane.showInputDialog("What is da secret Password?");
	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
	if(input.equals(passcode)){
		JOptionPane.showMessageDialog(null, "Incoming MOOSE!");
	// 4. If their guess matches the password, show them the secret message

	// 5. If the password does not match, pop-up "INTRUDER!!"
	}
	else {
	JOptionPane.showMessageDialog(null, "BALEETED! BALEETED! BALEETED! BALEETED! BALEETED!");	
	}
	}
}