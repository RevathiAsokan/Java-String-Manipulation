// to create a new string object with the contents of a character array

class strpro11
{
	public static void main(String args[])
	{
		char[] ch = {'h','e','l','l','o'};
		char[] newch = new char[] {'j','a','v','a'};
		
		String newstr1 = new String(ch);
		String newstr2 = String.copyValueOf(newch,0,4);
		
		System.out.println("New String1: "+newstr1);
		System.out.println("New String2: "+newstr2);
	}
}