
public class Main {

	public static void main(String[] args) {
		
		double[] myList = new double[4];
		double[] list = {1.2,2.5,3.4,4.6};
		double total = 0;
		double max = list[0];
		
		/*for(double item: list) {
		System.out.println(item);
		}*/
		
		
		for(int i=0;i<list.length;i++) {
			
			if (max<list[i]) {
				max=list[i];
				
			}
			
			total += list[i];
		}
		
		System.out.println(total);
		System.out.println(max);

		
		
		
	}

}
