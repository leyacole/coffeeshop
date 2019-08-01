package co.grandcircus.coffeeshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")

public class Users {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	//Long id;
	
	//private int id;
	private String firstName;
	private String email;
	private String password;
	
	public Users() {  //constructor
			
	}
	
	public Users(int id, String firstName, String email, String password) {  //constructor
		super();
		//this.id = id;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
	}
	
//	public int getId() {
//		return id;
//	}
	public String getName() {
		return firstName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
//	public void setId(int id) {
//		this.id = id;
//	}
	public void setName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [firstName=" + firstName + ", email=" + email + ", password=" + password + "]";
	}

	
	

	
	
	

}
