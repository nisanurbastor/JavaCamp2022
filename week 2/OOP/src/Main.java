import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// SET VALUE
		Product product1 = new Product();
		product1.setName("Delonghi Coffee Machine");
		product1.setDiscount(7);
		product1.setUnitInStock(3);
		product1.setUnitPrice(5800);
		// GET VALUE
		// System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Sinbo Coffee Machine");
		product2.setDiscount(1.25);
		product2.setUnitInStock(9);
		product2.setUnitPrice(5400);
		

		Product product3 = new Product();
		product3.setName("Kitchen Coffee Machine");
		product3.setDiscount(5);
		product3.setUnitInStock(4);
		product3.setUnitPrice(6900);
		

		Product[] products = { product1, product2, product3 };

		for (Product item : products) {
			System.out.println("Name....: " + item.getName());
			System.out.println("Discount: " + item.getDiscount());
			System.out.println("Price...: " + item.getUnitPrice());
			System.out.println("Stock...: " + item.getUnitInStock());
			System.out.println("---------------------------------");
		}
	}

}
