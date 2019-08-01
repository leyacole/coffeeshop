//package co.grandcircus.coffeeshop;
//
//import co.grandcircus.coffeeshop.dao.ProductsDao;
//import co.grandcircus.coffeeshop.dao.UsersDao;
//import co.grandcircus.coffeeshop.entity.Products;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//
//public class ProductsController {
//	
//	@Autowired
//	private ProductsDao dao;
//	
//	
//	@RequestMapping("/")
//	public ModelAndView index() {
//		return new ModelAndView("redirect:/products");
//	}
//	
//	@RequestMapping("/products")
//	public ModelAndView list() {
//		List<Products> listofProducts = dao.findAll();
//		return new ModelAndView("list", "products", listofProducts); 
//	}
//	
//	@RequestMapping("/products/detail")
//	public ModelAndView detail(@RequestParam("name") String name) {
//		Products products = dao.findByname(name);
//		
//		return new ModelAndView("detail", "name",name);
//	}
//	
//	@RequestMapping("/products/edit")
//	public ModelAndView edit(@RequestParam("name") String name) {
//		Products products = dao.findByname(name);
//		return new ModelAndView("edit", "name", name);
//	}
//	
//	@PostMapping("/products/edit")
//	public ModelAndView save(@RequestParam("name") String name, Products products) {
//		products.setName(name);
//		dao.update(products);
//		
//		return new ModelAndView("redirect:/products/detail?name=" + name);
//	}
//	
//	@RequestMapping("/products/add")
//	public ModelAndView add() {		
//		return new ModelAndView("add");
//	}
//	
//	@PostMapping("products/add")
//	public ModelAndView addSubmit(Products products) {
//		dao.create(products);
//		return new ModelAndView("redirect:/products");
//	}
//
//}
