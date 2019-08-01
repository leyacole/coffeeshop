package co.grandcircus.coffeeshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.coffeeshop.entity.Products;



@Repository
@Transactional
public class ProductsDao {
	
	@PersistenceContext
	EntityManager em;
	
	public List<Products> findAll() {
		
		List<Products> products = em.createQuery("FROM Products", Products.class)
				.getResultList();
		return products;
		
	}
	//find specific Product with its unique ID
	public Products findById(Long id) {
		return em.find(Products.class, id);
	}
	
	public void create(Products product) {
		 em.persist(product);
	}
	
	public void update(Products product) {  //edit
		em.merge(product);
		
	}
	
	public void delete(Long id) {
		Products product = em.getReference(Products.class, id);
		em.remove(product);
	}
}

	