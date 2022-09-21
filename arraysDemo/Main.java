import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String student1 = "Ahmet";
		String student2 = "Mehmet";
		String student3 = "Ayşe";
		String student4 = "Fatma";

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		System.out.println("--------------------");
		
		String[] students = new String[4];
		students[0]="Ahmet";
		students[1]="Mehmet";
		students[2]="Ayşe";
		students[3]="Fatma";

		for (int i=0; i<students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("--------------------");
		
		for (String item : students) {
			System.out.println(item);
		}
	}

}
