//Author Pranav	

//this program is about using the if-else statement
//Version:10/10/15


import java.lang.reflect.AnnotatedArrayType;
import java.util.Scanner;

public class BMR {
public static void main(String[] args) {	
	
	Scanner in=new Scanner(System.in);
	double tocentimeters=2.54;
	double tokilograms=0.453592;
	System.out.print("Enter your name:");
	String Name=in.next();
	
	System.out.print("\n");
	
	int male=1;
	int female=2;
	
	System.out.print("If your a male enter 1. If female enter 2 :");
	int gender=in.nextInt();
	
	System.out.println("\n");
	
	if (gender==male)
	{
		System.out.print("enter your age:");
		int age=in.nextInt();
		System.out.print("\n");
		System.out.print("enter your height in inches");
		float height=in.nextFloat();
		System.out.print("\n");
		System.out.print("enter weight in pounds");
		float weight=in.nextFloat();
		System.out.print("\n");
		
		System.out.println();
		System.out.println("Calculate your bascal metabolism");
		System.out.println();
		System.out.println("name:"+Name);
		System.out.println("gender:male");
		System.out.println("Age"+age);
		float weightinkg=(float) (weight*tokilograms);
		System.out.println("Weight (kg)"+weightinkg);
		float heightincm=(float) (height*tocentimeters);
		System.out.println("height (cm):"+heightincm);
		System.out.println("Bascal Metabolic Rate"+(10*weightinkg+6.25*heightincm-5*age));
	}
else {
	System.out.print("enter your age:");
	int age=in.nextInt();
	System.out.print("\n");
	System.out.print("enter your height in inches");
	float height=in.nextFloat();
	System.out.print("\n");
	System.out.print("enter weight in pounds");
	float weight=in.nextFloat();
	System.out.print("\n");
	
	System.out.println();
	System.out.println("Calculate your bascal metabolism");
	System.out.println();
	System.out.println("name:"+Name);
	System.out.println("gender:female");
	System.out.println("Age"+age);
	float weightinkg=(float) (weight*tokilograms);
	System.out.println("Weight (kg)"+weightinkg);
	float heightincm=(float) (height*tocentimeters);
	System.out.println("height (cm):"+heightincm);
	System.out.println("Bascal Metabolic Rate"+(10*weight+6.25*height-5*age+5));
}
	
	
	
	
}

}
