//program using print out file 

//author:Pranav	
//Version:11/24/15


import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileReader;

public class BottleCapPrize1 {
	 public static void main(String [] args)throws IOException
	    {
	        
	        Scanner in = new Scanner(System.in);
	        int randomNumber = ((int)(0+ Math.random()* 5));
	        int counter = 0,sampleSize = 0;
	        int CapsOpen = 0;
	        //writing to file  
	        PrintWriter outFile = new PrintWriter (new File("text1.txt"));
	        
	        System.out.println("Enter number of trials");
	        int trials=in.nextInt();
	        //try for 20 trials
	        while(counter < trials)
	        {
	            randomNumber = ((int)(0+ Math.random()* 5));
	            outFile.println(CapsOpen);
	            if (randomNumber == 1)
	            {
	            	CapsOpen++;
	                counter++;
	            }
	            else
	            {
	                counter++;
	            }
	            sampleSize=counter; 
	          
	        }
	        outFile.close ( );
	        String token = "";
	        //reading back the trials to open bottle
	        Scanner inFile = new Scanner(new FileReader("text1.txt")); 
	        while (inFile.hasNext())
	        {
	        	token = inFile.next( ); 
	        	System.out.println (token); 
	        }
	       
	        double avg= CapsOpen/(double)sampleSize;
		    System.out.println(" your average was "+avg);
		    //outFile.println("your average was "+avg);
		    //outFile.close();
	    }
	}





