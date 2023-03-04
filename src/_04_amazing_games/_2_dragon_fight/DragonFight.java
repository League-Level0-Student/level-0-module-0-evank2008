package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		int php = 100;
		int dhp = 100;
			// playerHealth to store your health - set it equal to 100
	
			// dragonHealth to store the dragon's health - set it equal to 100

		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		int pattack = 0;
		int dattack = 0;
		int KickRandomStrength = 0;
		int yellboost = 0;
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
	
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.

		
		//  This while statement will cause the game attack code to repeat
		while (true) {
			int liquidnum = ran.nextInt(5);
			String liquid = "";
			if (liquidnum == 0) {
				liquid = "blood";
			}
			if (liquidnum == 1) {
				liquid = "milk";
			}
			if (liquidnum == 2) {
				liquid = "hot fudge sauce";
			}
			if (liquidnum == 3) {
				liquid = "guava juice";
			}
			if (liquidnum == 4) {
				liquid = "battery acid";
			}
			// THE PLAYER ATTACKS THE DRAGON
			//THIS CODE TELLS THE PLAYER THEIR STRENGTH
			int strengthnumber = ran.nextInt(3);
			String strengthword = "";
			if (pattack > 1) {
			if (strengthnumber == 0) {
				strengthword = "You feel so strong, you could throw a boulder " + pattack + " feet.";
			}
			if (strengthnumber == 1) {
				strengthword = "You feel so powerful that you could deal about " + pattack + " more damage to this guy than usual.";
			}
			if (strengthnumber == 2) {
				strengthword = "You feel so scientific that you could deliver a force of roughly " + pattack + ",000 Newtons to this creature's face.";
			}
			}// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
			String attack = JOptionPane.showInputDialog("Attack the dragon! Will you yell or kick it? "
					+ strengthword + " You feel like you have about " + php + " liters of " + liquid + " left in you.");
				// 4. If they typed in "yell":
			//THIS TELLS THE PLAYER WHAT HAPPENS WHEN THEY KICK
			String funnyword = null;
			int funnynumber = ran.nextInt(4);
			if (funnynumber == 0) {
				funnyword = "coughs up ";
			}
			if (funnynumber == 1) {
				funnyword = "suddenly realizes he is allergic to you, and breaks out in rashes. He scratches them so hard he scratches off ";
			}
			if (funnynumber == 2) {
				funnyword = "leaves and takes a vacation to Miami. On the way back, though, his plane crashes and he loses ";
			}
			if (funnynumber == 3) {
				funnyword = "slams into the wall behind him, shattering his spleen so thoroughly that he coughs up ";
			}
			//THIS PART ACTUALLY RUNS THE ATTACK
			if (attack.equals("yell")) {
				yellboost = ran.nextInt(10) + 5;
				pattack += yellboost;
				JOptionPane.showMessageDialog(null,"You yell furiously at the dragon! Your ATTACK increases by " + yellboost + "!");
			}
			else if (attack.equals("kick")) {
				KickRandomStrength = ran.nextInt(25);
				pattack += KickRandomStrength;
				dhp -= pattack;
				JOptionPane.showMessageDialog(null,"You kick the dragon so hard he " + funnyword + pattack + " health!");
				pattack -=KickRandomStrength;
			}
			//hehe
			else {
				JOptionPane.showMessageDialog(null,"Your dragon got so confused by your command that it had a siezure and died. Too bad.");
				System.exit(2);
			}
			
					  // -- Find a random number between 0 and 10 and store it in playerAttack. Use
					  // ran.nextInt(10)
			
				// 5. If they typed in "kick":
	
					  // -- Find a random number between 0 and 25 and store it in playerAttack.
		
				// 6. Subtract the player attack value from the dragon's health

			// THE DRAGON RETALIATES

				// 7. Find a random number between 0 and 35 and store it in dragonAttack
			dattack = ran.nextInt(35);
				// 8. Subtract the dragon attack value from the player's health
			php -= dattack;
			
			
			String verb = "";
			int dragonnumber = ran.nextInt(10);
			if (dragonnumber == 0) {
				verb = "busts";
			}
			if (dragonnumber == 1) {
				verb = "ruptures";
			}
			if (dragonnumber == 2) {
				verb = "defenestrates";
			}
			if (dragonnumber == 3) {
				verb = "smashes";
			}
			if (dragonnumber == 4) {
				verb = "squishes";
			}
			if (dragonnumber == 5) {
				verb = "sells";
			}
			if (dragonnumber == 6) {
				verb = "cyberbullies";
			}
			if (dragonnumber == 7) {
				verb = "barfs on";
			}
			if (dragonnumber == 8) {
				verb = "cuts off";
			}
			if (dragonnumber == 9) {
				verb = "vaporizes";
			}
			
			String part = "";
			int partnum = ran.nextInt(10);
			if (partnum == 0) {
				part = "spleens";
			}
			if (partnum == 1) {
				part = "toes";
			}
			if (partnum == 2) {
				part = "knuckles";
			}
			if (partnum == 3) {
				part = "kneecaps";
			}
			if (partnum == 4) {
				part = "wrists";
			}
			if (partnum == 5) {
				part = "stomachs";
			}
			if (partnum == 6) {
				part = "bones";
			}
			if (partnum == 7) {
				part = "prefrontal cortexes";
			}
			if (partnum == 8) {
				part = "eyeballs";
			}
			if (partnum == 9) {
				part = "wings";
			}
			JOptionPane.showMessageDialog(null,"The dragon " + verb + " " + dattack + " of your " + part + ".");
			// ASSESS THE DAMAGE

				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method
			
			
				// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method
			String mat = "";
			int matn = ran.nextInt(5);
			if (matn == 0) {
				mat = "gabagool";
			}
			if (matn == 1) {
				mat = "beans";
			}
			if (matn == 2) {
				mat = "flesh";
			}
			if (matn == 3) {
				mat = "feathers";
			}
			if (matn == 4) {
				mat = "Uranium-232";
			}
			if (dhp <= 0) {
				dragonLost(mat, php, dhp);
			}
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.
			if(php <= 0) {
				playerLost(mat, php, dhp);
			}
			
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
			

		} // this is the end of the while loop

	}

	static void playerLost(String mat, int php, int dhp) {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
		JOptionPane.showMessageDialog(null,"You are too weak to continue fighting. The dragon has defeated you with only " + dhp + " pounds of " + mat + " left on him. Without his massive treasure hoard, you are forever doomed to a life of poverty, eventually perishing due to chronic dysentery 819 years in the future.");

		System.exit(0);   //This code ends the program
	}

	static void dragonLost(String mat, int php, int dhp) {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
		JOptionPane.showMessageDialog(null,"With that final mighty blow, the dragon falls. You sieze its massive hoard, which holds " + php + " tonnes of " + mat + " and live happily ever after with your great wealth. You are eventually shot down by tax collectors 27401 years later for mistakenly calling the penny you picked up off the ground a ''gift''. ");
		System.exit(0);   //This code ends the program
	}

}
