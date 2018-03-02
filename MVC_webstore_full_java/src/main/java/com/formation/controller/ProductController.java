package com.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.formation.entity.Product;
import com.formation.services.ProductService;


@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/products")
	public String list(Model model) {

		List<Product> maListe = productService.getAllProducts();
		model.addAttribute("products", maListe);
		return "products";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String getAddNewProductForm(Model model) {
		Product newProduct = new Product();
		model.addAttribute("newProduct", newProduct);
		return "addProducts";
	}
	
//	// Sans initBinder et sans la methode initialiseBinder
//	@RequestMapping(value="/add", method=RequestMethod.POST)
//	public String processAddNewProductForm(@ModelAttribute("newProduct") Product newProduct) {
//		productService.addProduct(newProduct);
//		return "redirect:/products";
//	}
	
	// Avec initBinder et avec la methode initialiseBinder
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newProduct") Product newProduct, BindingResult result) {
		String[] suppressedFields = result.getSuppressedFields();
		if(suppressedFields.length > 0) {
			throw new RuntimeException("Attempting to bind disallowed fields : " + StringUtils.arrayToCommaDelimitedString(suppressedFields));
		}
		productService.addProduct(newProduct);
		return "redirect:/products";
	}
	
	@InitBinder
	public void initialiseBinder(WebDataBinder binder) {
		binder.setDisallowedFields("unitsInOrder", "discontinued");
	}

}


