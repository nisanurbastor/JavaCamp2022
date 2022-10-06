
public class Main {

	public static void main(String[] args) {
		
		findingNumber();

	}

	public static void findingNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int testNumber = 5;
		boolean isThere = false;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == testNumber) {
				isThere = true;
			}
		}

		if (isThere == true)
			getMessage(testNumber + " is 'test number' at this array.");
		else
			getMessage(testNumber + " is not 'test number' at this array.");

	}
	
	public static void getMessage(String message) {
		System.out.println(message);
	}
}
