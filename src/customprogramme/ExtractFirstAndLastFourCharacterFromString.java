package customprogramme;

public class ExtractFirstAndLastFourCharacterFromString {

	public static void main(String[] args) {
		
		String str = "www.erostrum.com";
		
		String firstfour = str.substring(0,4);
		System.out.println(firstfour);///www.
		
		String lastfour = str.substring(str.length()-4,str.length());
		System.out.println(lastfour);//.com
		
		String website = str.substring(4,str.length()-4);
		System.out.println(website);//erostrum
		
		
		

	}

}
