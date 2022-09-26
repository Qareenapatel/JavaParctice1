package customprogramme;

public class CountConstantVowelinString {

	public static void main(String[] args) {

		String str = "Java is object oriented language";

		int count = 0;
		int vCount = 0;
		int cCount = 0;

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				count++;
			}
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;
			} else if (str.charAt(i) > 'a' && str.charAt(i) < 'z') {
				cCount++;
			}
		}

		System.out.println("Total number of character in string are : " + count);
		System.out.println("Total number of Vowels in string are : " + vCount);
		System.out.println("Total number of Consonant in string are : " + cCount);

	}

	
}

