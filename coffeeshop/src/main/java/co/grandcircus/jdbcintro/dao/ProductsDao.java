package co.grandcircus.jdbcintro.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.jdbcinto.entity.Products;
import co.grandcircus.jdbcinto.entity.Users;


@Repository
public class ProductsDao {

	@Autowired
	private JdbcTemplate jdbc;

	public List<Products> findAll() {

		String sql = "SELECT * from products";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Products.class));
	}

	public Products findByname(String name) {

		String sql = "SELECT * from Products where name = ?";
		return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Products.class), name);
	}

	public void update(Products products) {

		String sql = "UPDATE Products Set name=?, description=?, price=? where name=?";
		jdbc.update(sql, products.getName(), products.getDescription(), products.getPrice());

	}
	
	public void create(Products products) {
		String sql = "INSERT INTO Products (name, description, price) values(?,?,?)";
		jdbc.update(sql, products.getName(), products.getDescription(), products.getPrice());
		
	}
	
	public void delete(String name) {
		String sql = "Delete From products where name = ?";
		jdbc.update(sql, name);
		
	}

}
