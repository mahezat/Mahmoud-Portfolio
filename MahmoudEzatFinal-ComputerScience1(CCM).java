package workplace;// import packages
import java.util.Scanner;
import javax.swing.JOptionPane;
public class EzatFinal {
	public static void main(String[] args) {// main first method
		int choice = 0;
		doWork(choice);// @ param choice
	}
		 static void doWork(int choice) { // second method
			
		
			do {
		
			int playerA[] = new int[6];// dice 1
		    int playerB[] = new int[6];// dice 3
		    int playerA2[] = new int[6];// dice 2
		    int playerB2[] = new int[6];// dice 4
		    int playerAScore = 0;// player 1 score
		    int playerBScore = 0;// player 2 score
		    int round = 1;// round counter
		   Scanner keyboard = new Scanner(System.in);// keyboard connection
		    
		    do { // do while loop to roll dice 
		    for (int i =0; i < 1; i++) {
		        System.out.println("Roll the die for round " + round++);
		        playerA[i] = (int) ((Math.random() * 6) + 1);
		        playerB[i] = (int) ((Math.random() * 6) + 1);
		        playerB2[i] = (int) ((Math.random() * 6) + 1);
		        playerA2[i] = (int) ((Math.random() * 6) + 1);
		    
		        System.out.println("player A has " + playerA[i] + " and " + playerA2[i] + " and player B has " + playerB[i] + " and " + playerB2[i]);
		    
		        int firstMax = Math.max(playerA[i], playerA2[i]);	
        	    int secMax = Math.max(playerB[i], playerB2[i]);
        	    if(firstMax > secMax) { // if statement to compare minimums and maximums
        	        playerAScore += 2;
        	    } else if(firstMax < secMax) {
        	        playerBScore += 2;
        	    } else if(firstMax == secMax) {
        	    	playerAScore += 0;
        	    	playerBScore += 0;
        	    }

        	    int firstMin = Math.min(playerA[i], playerA2[i]);// point assigment
        	    int secMin = Math.min(playerB[i], playerB2[i]);
        	    if(firstMin > secMin) {
        	        playerAScore += 1;
        	    } else if(firstMin < secMin) {
        	        playerBScore += 1;
        	    } else if(firstMin == secMin) {
        	    	playerAScore += 0;
        	    	playerBScore += 0;
        	    }
		    }
        	   
		    
		    {
        	   JOptionPane.showMessageDialog(null, "Roll again?, hit enter to roll."); // option to roll again
        	   

		    }
		   
		 }
		 
		        while(playerAScore < 20 && playerBScore < 20);
		   
		    System.out.println("The game is over.");	// print statements annouunce winner and list rounds played
		    
		    if(playerAScore >= playerBScore)
		        System.out.println("The winner is player A");
		    else
		        System.out.println("The winner is player B");
		    
		    System.out.println("Rounds played: " + round);
		    
		    System.out.println("Total Score of each player:");
		    System.out.println("Player A score: " + playerAScore);
		    System.out.println("Player B score: " + playerBScore);
		    
		    System.out.println("Enter 1 to run the program again, 0 to exit."); // run program again print statement
	        choice = keyboard.nextInt();// scan next int to detect desired user input
		    
	       
		
		}
		while(choice == 1); // runs code while user requests to run again
	


	}
}





	



