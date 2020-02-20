// To compare a given string to the specified character sequence

import java.util.Scanner;
import java.lang.String;

class strpro9
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first string : ");
		String str1 = in.nextLine();
		System.out.println("Enter second string : ");
		CharSequence str2 = in.nextLine();
		in.close();
		
		System.out.println("Result of Comparision : "+str1.contentEquals(str2));
	}
}