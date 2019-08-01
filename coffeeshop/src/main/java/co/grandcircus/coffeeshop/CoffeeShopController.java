package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.coffeeshop.dao.ProductsDao;
import co.grandcircus.coffeeshop.dao.UsersDao;
import co.grandcircus.coffeeshop.entity.Products;
import co.grandcircus.coffeeshop.entity.Users;

@Controller
public class CoffeeShopController {
	
	@Autowired
	 UsersDao usersDao;
	@Autowired
	 ProductsDao productDao;
	
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("list", productDao.findAll());
		return mv;
	}
	
	
	@RequestMapping("/signup")
	public ModelAndView register() {
		return new ModelAndView("signup");
	}
	
	@PostMapping("/signup")
	public ModelAndView signup(Users user) {
		ModelAndView mv = new ModelAndView("signup");
		
		if (!user.getName().contentEquals(null)) {
			usersDao.create(user);
			mv.addObject("users", user);
		}
		return mv;
	}
		
		
		@RequestMapping("/admin")
		public ModelAndView admin() {
			ModelAndView mv = new ModelAndView("admin");
			mv.addObject("list", usersDao.findAll() );
			return mv;
		}
		
		@RequestMapping("/admin/add")
		public ModelAndView add() {
			return new ModelAndView("add");
			
		}
		
		@PostMapping("/admin/add")
		public ModelAndView addSubmit(Products product) {
			productDao.create(product);
			return new ModelAndView("redirect/admin");
		}
		
		@RequestMapping("/admin/delete")
		public ModelAndView remove(@RequestParam("id") Long id) {
			productDao.delete(id);
			return new ModelAndView("redirect:/admin");
		}
		
}

	 
