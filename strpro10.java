// Compare a given string to the specified string buffer

import java.util.Scanner;
import java.lang.String;

class strpro10
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first string : ");
		String str1 = in.nextLine();
		System.out.println("Enter second string : ");
		StringBuffer str2 = new StringBuffer(in.nextLine());
		in.close();
		
		System.out.println("Result of Comparision : "+str1.contentEquals(str2));
	}
}