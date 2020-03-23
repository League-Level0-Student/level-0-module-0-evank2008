package _05_greeter;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String fakename = JOptionPane.showInputDialog("What is your name?");
	String input = JOptionPane.showInputDialog("Your REAL name. I know you entered some silly false name. What's your REAL name?");
	JOptionPane.showMessageDialog(null,"Okay, fine. Hi, "+input);






}
	
	
	
	
}
