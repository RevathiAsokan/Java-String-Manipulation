// Get the character at the given index within the String

import java.util.Scanner;
import java.lang.String;

class strpro1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int loc;
		
		System.out.println("Enter a string and an index: ");
		String str = in.nextLine();
		loc = in.nextInt();
		in.close();
		
		System.out.println("Character at the given index "+loc+" is "+str.charAt(loc+1));
	}
}