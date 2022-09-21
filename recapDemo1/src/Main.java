
public class Main {

	public static void main(String[] args) {
		int number1 = 20;
		int number2 = 25;	
		int number3 = 225;

		if(number1>number2 && number1>number3) {
			System.out.println("Number1 is the greatest number");
		}
		else if(number2>number1 && number2>number3) {
			System.out.println("Number2 is the greatest number");
		}
		else {
			System.out.println("Number3 is the greatest number");
		}
	}

}
