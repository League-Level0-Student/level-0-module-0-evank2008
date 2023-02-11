package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
int count = 0;

while ( count < 1 ) {
	   count +=1;
		// 1. Ask the user if they know how to write code.
		String eligibility = JOptionPane.showInputDialog("Do you know how to code? yes/no.");
		// 2. If they say "yes", tell them they will rule the world.
if (eligibility.equals("yes"))  {
	
	JOptionPane.showMessageDialog(null,"good job");

} else if (eligibility.equals("no")) {
	JOptionPane.showMessageDialog(null,"too bad, try taking coding classes.");
	String tryagain = JOptionPane.showInputDialog("Try again? yes/no");
	if (tryagain.equals("yes")) {
		count -=1;
	} else {
		JOptionPane.showMessageDialog(null,"Close Program?");
	}

}
else {
	JOptionPane.showMessageDialog(null,"<ERROR> INVALID INPUT.");
	String tryagain = JOptionPane.showInputDialog("Try again? yes/no");
	if (tryagain.equals("yes")) {
		count -=1;
	} else {
		JOptionPane.showMessageDialog(null,"Close Program?");
	}

}
		
// 3. Otherwise, tell them to sign up for classes at The League.
		}
	}
}
