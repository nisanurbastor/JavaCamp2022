
public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int testNumber = 3;
		boolean isThere = false;
		
		for(int i=0; i<numbers.length; i++) {
			if (numbers[i]==testNumber) {
				isThere = true;
			}
		}
		
		if(isThere==true)
			System.out.println("There is test number at this array.");
		else 
			System.out.println("There is not test number at this array.");
		
		
	
	}

}
	
