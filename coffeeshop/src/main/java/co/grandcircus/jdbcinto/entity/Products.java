package co.grandcircus.jdbcinto.entity;

public class Products {
	
	private String name;
	private String description;
	private double price;
	
	public Products() {  //constructor
			
	}
	
	public Products(String name, String description, double price) {  //constructor
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice()	{
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [name=" + name + ", description=" + description + ", price=" + price + "]";
	}

}



