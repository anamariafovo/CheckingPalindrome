package palindrome.check;

import java.util.Scanner;


public class Main {
	
	/** PLAY **/
	
	private static void play(Scanner kb) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		String str = sc.nextLine();
		String original_str = str;
		
		String reverse_str = "";
		
		for(int i = str.length()-1; i >= 0; --i)
		{
			reverse_str = reverse_str + str.charAt(i);
		}
		if(original_str.equals(reverse_str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	
	}
	
	
	/** ASK TO PLAY AGAIN METHOD **/
	
	private static boolean askToPlayAgain(Scanner sc) {

	    System.out.println("Play again? [Y/N]:");

	    String response = sc.nextLine();

	    return response.equalsIgnoreCase("Y");

	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		while(true)
		{			
			play(sc);
				
			if(!askToPlayAgain(sc)) 
				break;

		}
	}
}
