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
import co.grandcircus.coffeeshop.entity.Users;


@Repository
@Transactional
public class UsersDao {
	
	@PersistenceContext
	EntityManager em;
	
public List<Users> findAll() {
		
		List<Users> users = em.createQuery("FROM Products", Users.class)
				.getResultList();
		return users;
		
	}
	//find specific Product with its unique ID
	public Users findById(Long id) {
		return em.find(Users.class, id);
	}
	
	public void create(Users users) {
		 em.persist(users);
	}
	
	public void update(Users users) {  //edit
		em.merge(users);
		
	}
	
	public void delete(Long id) {
		Users users = em.getReference(Users.class, id);
		em.remove(users);
	}
}

	

	
	