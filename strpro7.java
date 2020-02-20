// Concatenate string

import java.util.Scanner;
import java.lang.String;

class strpro7
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first string : ");
		String str1 = in.nextLine();
		System.out.println("Enter second string : ");
		String str2 = in.nextLine();
		in.close();
		
		System.out.println("concatenated string : "+str1.concat(str2));
	}
}