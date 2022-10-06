
public class Main {

	public static void main(String[] args) {
		
		String message = "The weather is perfect today.";
		String newMessage = message.substring(0, 2);
		System.out.println(newMessage);
		
		message = getCity();
		System.out.println(message);
		
		int number = add(124, 587);
		System.out.println(number);
		
		update();
		
		int total = add2(12,25,48,56,14,32,89);
		System.out.println(total);
		
	}
	
	public static void remove() {
		System.out.println("It was removed");
	}
	
	public static void update() {
		System.out.println("It was updated");
	}
	
	public static String getCity() {
		return "Sakarya";
	}
	
	public static int add (int number1,int number2) {
		return number1 + number2;
	}
	
	public static int add2 (int... numbers) {
		int total = 0;
		for(int i=0; i<numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}
}
