//Beau Heffron
// Period 9

import java.util.Scanner;
import java.io.*;
public class L3P3
{
	public static void main (String args[])
	{
		try
							{

								Scanner sc = new Scanner(System.in);
								System.out.println("What is the name of your file?");
								String fileName = sc.nextLine();
								Scanner inFile = new Scanner(new File(fileName));
								int count = 0;
								int chars = 0;
								String word;
								int x;
							while(inFile.hasNext())
							{
								word = inFile.next();
								x = word.length();
								chars += x;
    							count++;
								}

						System.out.println("Number of Words:\t\t" + count);
						System.out.println("Number of Chars:\t\t" + chars);

					}catch(FileNotFoundException e)
					{
						System.out.println("BAD FILE!");
					}



	}
}