package examples;

public class Reversestr {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			String a = "book";
			int strlen = a.length();
			System.out.println("The reverse string is:");
			for(int i = strlen;i>0;i--)
			{
				System.out.print(a.charAt(i-1));
			}
			
			
	}

}
