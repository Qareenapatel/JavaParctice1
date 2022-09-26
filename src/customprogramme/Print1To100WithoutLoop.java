package customprogramme;

public class Print1To100WithoutLoop {

	public static void main(String[] args) {

		PrintNum(1);
		printNumber(1, 100);
	}

	public static void PrintNum(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;
			PrintNum(num);
		}
	}
	
	//or
	public static void printNumber(int stNum, int endNum) {
		if(stNum<= endNum){
			System.out.println(stNum);
			stNum++;
			printNumber(stNum, endNum);
			
		}
		
	}

}
