package customprogramme;

import java.util.Scanner;

public class VowelCharacterCountInString {

	public static void main(String[] args) {

		/*
		 * String str =
		 * "Java is object oriented language and I like to learn different launguages in testing"
		 * ;
		 * 
		 * char[] chars = str.toCharArray();
		 * 
		 * int count = 0;
		 * 
		 * for(char c: chars){
		 * 
		 * switch(c) { case 'a': case 'e': case 'i': case 'o': case 'u': count++; break;
		 * }
		 * 
		 * }
		 * 
		 * 
		 * System.out.println("Number of vowels in string = "+ count);
		 */

		// or

		System.out.println("Enter some string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] chars = str.toCharArray();

		int count = 0;

		for (char c : chars) {

			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}

		}

		System.out.println("Number of vowels in string = " + count);	

	}
}
