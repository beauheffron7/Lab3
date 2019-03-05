//Beau Heffron
//Period 9

import java.util.*;
import java.io.*;
public class L3P7
{
	public static void main (String args[])
	{

		try
									{
										Random x = new Random();
												int count = 0;
												int tries = 0;

												while(count<=1)
													{
														Scanner sc = new Scanner(System.in);
														Scanner inFile = new Scanner(new File("S:\\HS\\COMPSCI2\\REPOSITORY\\data\\Words5.txt"));
														tries++;
														String y = "";
													for (int z = 0; z<5; z++)
														{

															char a = (char)(x.nextInt(26)+'a');
															y += a;
														}
														System.out.println(y);
														// y = "Aaron";
														while(inFile.hasNext())
														{
															String q = inFile.next();
															if (y.equals(q))
															{
																count++;
																System.out.println(y);
															}
														}
													}
												System.out.println("It took " + (tries - 1));

							}catch(FileNotFoundException e)
							{
								System.out.println("BAD FILE!");
					}




	}
}