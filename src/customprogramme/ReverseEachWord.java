package customprogramme;

public class ReverseEachWord {

	public static void main(String[] args) {

		/*
		 * String str = "How are you";
		 * 
		 * String[] arr = str.split(" ");
		 * 
		 * Object result = ""; for (String word : arr) { String reverseWord = ""; int j
		 * = word.length(); while (j > 0) { char ch = word.charAt(j - 1); reverseWord =
		 * reverseWord + ch; j--; } result = result + reverseWord+" "; }
		 * System.out.println(result); }
		 */
	

	String str = "How are you";
    String[] arr = str.split(" ");

	for(
	String word:arr)
	{
		String revWord = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			revWord = revWord + word.charAt(i);
		}

		System.out.print(revWord + " ");
	}
}}
