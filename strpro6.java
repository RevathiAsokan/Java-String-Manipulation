// compare two strings lexicographically ignoring case


import java.util.Scanner;
import java.lang.String;

class strpro6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first string : ");
		String str1 = in.nextLine();
		System.out.println("Enter second string : ");
		String str2 = in.nextLine();
		in.close();
		
		int cmp = str1.compareToIgnoreCase(str2);
		
		System.out.println("Lexicographic order ignoring case : ");
		if(cmp < 0)
			System.out.println(str1+"\n"+str2);
		else if(cmp > 0)
			System.out.println(str2+"\n"+str1);
		else
			System.out.println("Both are same");
	}
}