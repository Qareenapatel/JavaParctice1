package customprogramme;

public class Print1To100 {

	public static void main(String[] args) {
		
		/*
		 * for(int i=1;i<=100;i++) { System.out.println(i); }
		 */

		int one='A'/'A';
		String s1 = "..........";
		
		for(int i=one; i<=(s1.length() * s1.length()); i++) {
			System.out.println(i);
		}
		
		//a=97,b=98,c=99,d=100
		for(int i=one; i<='d'; i+=one) {
			System.out.println(i);
		}
		
	}

}
