package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // Make a new Robot
Robot bob = new Robot();

        // Put the robot's pen down
bob.penDown();

        // Make the robot move as fast as possible
bob.setSpeed(1000);
String sidestring = JOptionPane.showInputDialog("How many sides in a polygon?");
int sidecount=Integer.parseInt(sidestring);
if(sidecount<3) {
	JOptionPane.showMessageDialog(null,"Wrong, a polygon needs at least 3 sides.");
}
    	// COUNT. Create an int variable that will count how many sides of the shape we have drawn.
    	//        The start value will be zero because no sides have yet been drawn. Use this code:
		  /**     int sides = 0;    **/

    	int sides = 0;
    	//change the sidecount variable to change which shape you get.
    	
        // Start a while loop to repeat the MOVE, TURN, and COUNT code 4 times

    	while (sides<sidecount) {
			
		
        //         MOVE your robot 200 pixels
bob.move(800/sidecount);

        //         TURN the robot 90 degrees to the right
    	bob.turn(360/sidecount);
    	
    	//         COUNT. Add one to the number of sides the robot has drawn      sides+=1;
sides+=1;
    	if(sides==sidecount) {
    		bob.setSpeed(500);
    		bob.turn(360);
    		bob.penUp();
    		bob.setSpeed(1000000000);
    		bob.move(10000);
    	}
    	// End the while loop here
    	}
    	// Run the program. You should see a square
    	
    	
    	// Now change the code to draw a different shape 
    	// e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)
   
    }
}
