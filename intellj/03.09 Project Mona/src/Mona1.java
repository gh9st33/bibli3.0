
//The mona class calcultes the overdue of books for the CSA media center

//Author:Pranav
//Version-10/10/15
import java.util.Scanner;
public class Mona1 {
public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);    
     
     System.out.print("Please enter your name (first, last): ");
    String  firstName = in.next(); 
     String lastName = in.nextLine();
     System.out.print("\n");
     
 
	System.out.print(" enter your phone number((###) ###-####):");
      String phone=in.next();
	
    System.out.print("\n");
	
	System.out.print("enter the title of the book: ");
	String nameofbook=in.next();
	
	System.out.print("\n");
	
	System.out.print("enter the date checked out(mm//dd/yyyy):");
	String datecheckout=in.next();
	
	System.out.print("\n");
	
	System.out.print("days late:");
	String x=in.next();
     int dayslate= Integer.parseInt(x);
	
	
	
	System.out.print("\n");
	
	System.out.print("daily fine:");
	String y=in.next();
    Double dailyfine= Double.parseDouble(y);
	
	System.out.println("\n");
	System.out.println("---------Text for email message------");
	System.out.println();
	System.out.println("Text for email message");
	
	System.out.print("To: Earl Grace-");
	String enteryouremail=in.next();
	
	System.out.print("\n");
	
	System.out.print("From:");
	String enterlibraryemail=in.next();
	
	System.out.print("\n");
	
	System.out.print("Subject:");
	String entersubject=in.next();
	
	System.out.print("\n");
	
	System.out.println("_____________________________________________");
	
	System.out.println(nameofbook+" "+("was checked out on:"+" "+datecheckout));
	System.out.println("This book is currently"+" "+dayslate+" "+("Day(s) late"));
	
	System.out.println("Your fine has accumulated to:"+(dailyfine*dayslate)+" "+"dollars(s)");
	
}
}

