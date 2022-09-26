package customprogramme;

public class CountUppercase_LowercaseCharacters {

	public static void main(String[] args) {

		/*
		 * String s = "Welcome TO AutOMAtion TesTING CLass";
		 * 
		 * String lower = " "; String upper = " ";
		 * 
		 * for (int i = 0; i < s.length(); i++) { char ch = s.charAt(i); if (ch > 'a' &&
		 * ch < 'z') { upper = upper + ch;
		 * 
		 * } else { lower = lower + ch; } }
		 * 
		 * System.out.println(lower); System.out.println(upper);
		 */
		// or

		
		 String s = "Welcome TO AutOMAtion TesTING CLass";
		  
		  int lower = 0; int upper = 0;
		  
		  for(int i=0;i<s.length();i++) { 
			  char ch = s.charAt(i); 
			  if(ch>=65 && ch<=90) {
		  upper++;
		  
		  }else { lower++; } }
		  
		  System.out.println(s.replaceAll("\\s+", "")); System.out.println("Lower =" +
		  lower); System.out.println("Upper =" + upper);
		
	}

}
