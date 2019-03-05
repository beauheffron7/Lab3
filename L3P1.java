//Beau Heffron
// Period 9
//

import java.util.Scanner;
import java.io.*;
public class L3P1
{
	public static void main(String[] args)
	{

			try
					{

						Scanner sc = new Scanner(System.in);
						System.out.print("What is the name of your file?");
						String fileName = sc.nextLine();
						Scanner inFile = new Scanner(new File(fileName));


						int bigNum=inFile.nextInt();
						int count=0;
						int sum=0;
						int smallNum = bigNum;
						while(inFile.hasNext())
						{
							int num = inFile.nextInt();
							if (num < smallNum)
							{
								smallNum=num;
							}
							if (num>bigNum)
							{
								bigNum=num;
							}
							count++;
							sum+=num;
						}
						System.out.println();
						System.out.println("There are " +count+ " numbers in this file");
						System.out.println( "The Average is:\t\t" +((double)sum)/count);
						System.out.println("The Largest number is:\t\t" + bigNum);
						System.out.println("The Smallest number is:\t\t" + smallNum);
					}catch(FileNotFoundException e)
					{
						System.out.println("BAD FILE!");
					}

	}

}