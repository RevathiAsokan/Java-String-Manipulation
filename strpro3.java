// Get the character (unicode code point) before the specified index within the string


import java.util.Scanner;
import java.lang.String;

class strpro3
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int loc;
		
		System.out.println("Enter a string and an index: ");
		String str = in.nextLine();
		loc = in.nextInt();
		in.close();
		
		System.out.println("Unicode of character at the given index "+loc+" is "+str.codePointBefore(loc+1));
	}
}