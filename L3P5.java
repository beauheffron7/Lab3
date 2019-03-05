//Beau Heffron
// Period 9
import java.util.*;
import java.io.*;
public class L3P5
{
	public static void main (String args[])
	{
		System.out.print("Enter a letter:\t\t");
		Scanner sc = new Scanner(System.in);
		char char1 = sc.nextLine().charAt(0);

		try
									{

										Scanner inFile = new Scanner(new File("S:\\HS\\COMPSCI2\\REPOSITORY\\data\\Names.txt"));
										int count = 0;

										while(inFile.hasNext())
										{
											String check = inFile.nextLine();
											if(check.charAt(0)== (char)(char1))
												{
													count ++;
													System.out.println(check);

												}

											}
											System.out.println("There are " + count + " names");

							}catch(FileNotFoundException e)
							{
								System.out.println("BAD FILE!");
					}




	}
}