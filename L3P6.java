//Beau Heffron
//period 9
import java.util.Random;

public class L3P6
{
	public static void main(String[] args)
	{
		Random x = new Random();
		int count = 0;
		String y;
		while(count<20)
		{
		count++;
		y = "   ";
		for (int z = 0; z<5; z++)
			{
			 char a = (char)(x.nextInt(26)+'a');
			 y += a;
			}
			System.out.print(y);
		}
	}
}