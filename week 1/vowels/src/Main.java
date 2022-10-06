
public class Main {

	public static void main(String[] args) {
		
		char letter = 'A';
		
		switch (letter) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalın ve sesli harftir.");
				break;
			case 'E':
			case 'İ':
			case 'Ö':
			case 'Ü':
				System.out.println("İnce ve sesli harftir.");
				break;
		}
	}

}
