//Purpose-to show the use of nested loops 

//Author-Pranav
//version- 11/13/15
import java.util.*;

public class DiceProbability1
{
    public static void main(String[] args)
    {
    	
		Random rand;
		rand = new Random();
		
		Scanner input;
		input = new Scanner(System.in);
		 //Declare and initialize variables and objects
		int die1, die2;
		int sides;
		int diceRolls;
		int sum;
		int totalRolls;
		int sumOfBothDice;
		int totalMatches = 0;//Number of times sum of dice matches the current sum
		
		  //Input: ask user for number of rolls and number of sides on a die
		System.out.print("Please enter the amount of sides you want on the dice: ");
		
		sides = input.nextInt();
		
			if(sides < 1) {
				System.out.println("You cannot have 0 or negative sides on dice.");
				return;
			}
		
		System.out.print("Please enter the amount of times you want to roll the dice: ");
		
		diceRolls = input.nextInt();
		
			if(diceRolls < 1) {
				System.out.println("You cannot roll a dice 0 or negative times and find its probability.");
				return;
			}
		
		System.out.println();
		System.out.println("Sum of the Dice \t\t\t\t Probability");
		System.out.println("-------------------------------------------------------------");
		
		
		//Using nested loops, cycle through the possible sums of the dice.
		
        //Loop to increment through the possible sums of the dice
		
      //Count how many times the sum of the dice match the current sum being looked for
			for(sum = 2; sum <= 2*sides; sum ++) {
				totalMatches = 0;
				for(totalRolls = 0; totalRolls <= diceRolls; totalRolls ++) 
				{
					//Check if the sum of dice is equal to the given sum
					die1 = rand.nextInt(sides) + 1;
					die2 = rand.nextInt(sides) + 1;
					sumOfBothDice = die1 + die2;
					
						if(sumOfBothDice == sum) {
							totalMatches += 1;
						}
				}
				// calculate percentage of throws which resulted in the given sum
				double probability = (totalMatches / (double)totalRolls) * 100;
	System.out.println(sum + "  \t\t\t\t\t " + probability);
                
				
			}
	}
}
