import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String messageString = "The wheater is very good!";
		
		System.out.println(messageString);
		System.out.println("Number of character: " + messageString.length());
		System.out.println("The character at  the fifth index: " + messageString.charAt(5) );
		
		System.out.println(messageString.concat(" Perfect"));
		System.out.println(messageString.startsWith("T"));
		System.out.println(messageString.endsWith("a"));
		
		char[] characters = new char[9];
		messageString.getChars(0,9, characters, 0);
		//scrBegin, scrEnd, dstBegin
		System.out.println(characters);
		
		System.out.println(messageString.indexOf('e'));
		System.out.println(messageString.lastIndexOf('e'));
		
		System.out.println(messageString.replace(' ', '-'));
		System.out.println(messageString.substring(4,7));
		
		for(String word:messageString.split(" ")) {
			System.out.println(word);
		}
		
		System.out.println(messageString.toLowerCase());
		System.out.println(messageString.toUpperCase());  
	}

}
