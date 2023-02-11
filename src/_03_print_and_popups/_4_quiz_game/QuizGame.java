package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		JOptionPane.showMessageDialog(null,"Are you ready to take The Impossible Quiz?");

				// 2.  Ask the user a question 
		
		//copypaste the following code to create new questions. Be sure to change the q and answer variables.
		String q1 = JOptionPane.showInputDialog("What is 11 x 827634020?");
		String answer1 = "9103974220";
				// 3.  Use an if statement to check if their answer is correct
				if (q1.equals(answer1)) {
					JOptionPane.showMessageDialog(null,"Correct!");
					score +=1;

				} else {
					JOptionPane.showMessageDialog(null,"Wrong!");
					score -=1;

				}
				JOptionPane.showMessageDialog(null,"Alright. Next question counts (2^31)-1 times");
				String q2 = JOptionPane.showInputDialog("What is 2x48+1");
				String answer2 = "98";
						// 3.  Use an if statement to check if their answer is correct
						if (q2.equals(answer2)) {
							JOptionPane.showMessageDialog(null,"Correct!");
							score +=2147483647;

						} else {
							JOptionPane.showMessageDialog(null,"Wrong!");
							score -=2147483647;

						}
				
				
				JOptionPane.showMessageDialog(null,"Alright, are you ready to see your final score?");
				if (score < 2) {
					if (score > 0) {
					JOptionPane.showMessageDialog(null,"You scored 1 point.");
					}
				} else {
				JOptionPane.showMessageDialog(null,"You scored " + score + " points.");
				}
				JOptionPane.showMessageDialog(null,"Congratulaions!");
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
