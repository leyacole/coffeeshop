package co.grandcircus.jdbcinto.entity;

public class Users {
	
	private String name;
	private String password;
	private String username;
	
	public Users() {  //constructor
			
	}
	
	public Users(String name, String password, String username) {  //constructor
		super();
		this.name = name;
		this.password = password;
		this.username = username;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUsername()	{
		return username;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Users [name=" + name + ", password=" + password + ", username=" + username + "]";
	}
	
	

}
