
public class Main {

	public static void main(String[] args) {

		//reference type 
		CustomerManager object = new CustomerManager();
		object.add();
		object.remove();
		object.update();
		
		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {4,5,6};
		
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
	}
	
}
