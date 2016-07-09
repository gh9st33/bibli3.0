//purpose- to check if phrase is a palindrome
//Version- 3/16/16
//Author- Pranav
package palindrome;

public class RecursivePalindrome {
// to check if the string is a palindrome
	void ispalin(String input)
	{
		input =helper(input);
		if (input.length()==1)
		{
			System.out.println("string is a palindrome");
		}
		else if (input.length()==2)
		{
			if(input.charAt(0)==input.charAt(1))
			{
				System.out.println("string is a palindrome");
			}
			else {
				System.out.println("the string is not a palindrome");
			}
		}
		else 
		{
			if((input.charAt(0)==input.charAt(input.length()-1)))
			{
				
				ispalin(input.substring(1,input.length()-1));
			}
			else
			{
				System.out.println("string is not a palindrome");
			}
		}
	}
	//checks if there is proper captions 
	String helper(String x)
	{
		String temp;
		temp=x.toLowerCase();
		temp=temp.trim();
		String tempRemovepunc="";
		for(int i=0;i<temp.length();i++)
		{
			char c = temp.charAt(i);
			if(Character.isDigit(c) || Character.isAlphabetic(c))
			{
				tempRemovepunc += c;
			}
			
		}
		temp = tempRemovepunc;

		return temp;
	}
	
}
