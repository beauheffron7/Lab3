//Beau Heffron
// Period 9

import java.util.Scanner;
import java.io.*;
public class L3P2
{
	public static void main (String args[])
	{
		try
							{

								Scanner sc = new Scanner(System.in);
								System.out.println("What is the name of your file?");
								String fileName = sc.nextLine();
								System.out.println("What word would you like to know the frequincy of?\t\t");
								String word1 = sc.next();
								Scanner inFile = new Scanner(new File(fileName));
								int count = 0;

							while(inFile.hasNext())
							{
							String word2 = inFile.next();

							if (word2.indexOf(word1)!= -1)
							{
								count++;
							}


						}
						System.out.println(count);

					}catch(FileNotFoundException e)
					{
						System.out.println("BAD FILE!");
					}



	}
}