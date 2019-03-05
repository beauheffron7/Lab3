//Beau Heffron
// Period 9
import java.util.*;
import java.io.*;
public class L3P4
{
	public static void main (String args[])
	{
	 System.out.println("Enter a phrase to see if it is a palindrome");
	 		Scanner sc = new Scanner(System.in);
	 		String word = sc.nextLine();
	 		word = word.replaceAll("[^a-zA-Z]"  ,  " " ).toLowerCase();
	 		int length = word.length();
	 		String palindrome = "" ;
	 		for (int i = length - 1; i>=0; i--)
	 		{
	 		 palindrome = palindrome + word.charAt(i);
	 		}
	 		if (word.equalsIgnoreCase(palindrome))
	 		{
	 			System.out.println("The phrase that you entered is a palindrome");
	 		}
	 		else
	 		{
	 			System.out.println("The phrase that you entered is not a palindrome");
	 			System.out.println(palindrome);
	 		}

	 	}
	 }
