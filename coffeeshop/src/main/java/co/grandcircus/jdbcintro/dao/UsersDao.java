package co.grandcircus.jdbcintro.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.jdbcinto.entity.Users;


@Repository
public class UsersDao {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	public List<Users> findAll() {
		
		String sql = "SELECT * from users";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Users.class));
	}
	
	public Users findByusername(String username) {
		
		String sql = "SELECT * from Users where username = ?";
		return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Users.class), username); 
	}
	
	public void update(Users users) {
		
		String sql = "UPDATE Users Set name=?, password=?, username=? where username=?";
		jdbc.update(sql, users.getName(), users.getPassword(), users.getUsername());
		
	}
	
	public void create(Users users) {
		String sql = "INSERT INTO Room (name, max_capacity, available) values(?,?,?)";
		jdbc.update(sql, users.getName(), users.getPassword(), users.getUsername());
		
	}
	
	public void delete(String username) {
		String sql = "Delete From room where username = ?";
		jdbc.update(sql, username);
		
	}
	

}
