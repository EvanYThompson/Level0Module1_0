import javax.swing.JOptionPane;

public class SecretMessageBox {


public static void main(String[] args) {
	

// Copyright Wintriss Technical Schools 2014

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */
 

	// 0. Make a main method and put steps 1-5 inside it
	
	// 1. Set the passcode in a String variable
	String password = "1942";
	// 2. Using a pop-up, ask for a secret message and store it in a variable
	String msg = JOptionPane.showInputDialog("What is the password?");
	// 3. Ask your friend for the passcode and store it in a variable
	
	

// 4. If the passcode matches, show the secret message
 if (msg.compareToIgnoreCase(password) > 0) {
	System.out.println(false);
 }

	// 5. If the passcode does not match, pop-up "INTRUDER!!"
 else if (password.compareToIgnoreCase(msg) > 0) {
	System.out.println(true);
 	}
 
	// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.
}
}