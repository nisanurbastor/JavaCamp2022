
public class Main {

	public static void main(String[] args) {

		Product product1 = new Product("47","Laptop","Monster",13999.59,11);
		Product product = new Product();
		
		
		product.name = "Laptop";
		product.description = "Excalibur";
		product.id = "23";
		product.stockAmount = 8;
		product.price = 14999.99;
		
		

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		product.setColor("Black");
		System.out.println(product.getColor());
		
		System.out.println(product.getCode());
	}

}
