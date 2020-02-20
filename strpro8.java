// check if a given string contains the specified sequence of char values

import java.util.Scanner;
import java.lang.String;

class strpro8
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str1 = in.nextLine();
		System.out.println("Enter sub string : ");
		String str2 = in.nextLine();
		in.close();
		
		System.out.println("Substring Found : "+str1.contains(str2));
	}
}