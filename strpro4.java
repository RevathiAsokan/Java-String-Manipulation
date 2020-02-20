// Get the count of unicode code points in a given range within the string


import java.util.Scanner;
import java.lang.String;

class strpro4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = in.nextLine();
		in.close();
		
		System.out.println("No. of unicode code points : "+str.codePointCount(0,5));
	}
}