package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.jdbcintro.dao.UsersDao;
import co.grandcircus.jdbcinto.entity.Users;

@Controller
public class CoffeeShopController {
	
	@Autowired
	private UsersDao dao;
	
//	@Autowired
//	private ProductsDao dao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("redirect:/users");
	}
	
	@RequestMapping("/users")
	public ModelAndView list() {
		List<Users> listofUsers = dao.findAll();
		return new ModelAndView("list", "users", listofUsers); 
	}
	
	@RequestMapping("/users/detail")
	public ModelAndView detail(@RequestParam("username") String username) {
		Users users = dao.findByusername(username);
		
		return new ModelAndView("detail", "username",username);
	}
	
	@RequestMapping("/users/edit")
	public ModelAndView edit(@RequestParam("username") String username) {
		Users users = dao.findByusername(username);
		return new ModelAndView("edit", "username", username);
	}
	
	@PostMapping("/users/edit")
	public ModelAndView save(@RequestParam("username") String username, Users users) {
		users.setUsername(username);
		dao.update(users);
		
		
		return new ModelAndView("redirect:/users/detail?idusername=" + username);
	}
	
	@RequestMapping("/users/add")
	public ModelAndView add() {		
		return new ModelAndView("add");
	}
	
	@PostMapping("/users/add")
	public ModelAndView addSubmit(Users users) {
		dao.create(users);
		return new ModelAndView("redirect:/users");
	}
}
