package customprogramme;

public class CountCharacterOccuranceInString {

	public static void main(String[] args) {
		
		String str = "Java is object oriented language";
		//how many characters are coming how many times
		int result = str.length()- str.replaceAll("a", "").length();
		System.out.println(result);

	}

}
