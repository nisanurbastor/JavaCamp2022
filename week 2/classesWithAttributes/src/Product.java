
public class Product {

	// CONSTRUCTER
	public Product(String id, String name, String description, double price, int stockAmount) {
		System.out.println("Constructer ran.");
	}

	public Product() {}
	
	
	// attributes | fields
	String id;
	String name;
	String description;
	double price;
	int stockAmount;
	private String code;
	private String color;

	// getter
	public String getColor() {
		return color;
	}

	// setter
	public void setColor(String color) {
		this.color = color;
	}

	// readonly
	public String getCode() {
		return this.name.substring(0, 1) + id;
	}
}
