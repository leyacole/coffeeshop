package co.grandcircus.coffeeshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")

public class Products {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String description;
	@Column(name="price")
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



