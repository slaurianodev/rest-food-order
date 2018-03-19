package br.com.slauriano.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.slauriano.model.Product;
import br.com.slauriano.repo.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping(value = "/api/v1/Product", method = RequestMethod.GET)
	public List<Product>getProducts() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;		
	}

	@RequestMapping(value = "/api/v1/Product/search/{searchText}", method = RequestMethod.GET)
	public List<Product>getProductsByNameOrDescription(@PathVariable("searchText") final String text){
		HashSet<Product> products = new HashSet<Product>();
		productRepository.findByNameContainingIgnoreCase(text).forEach(products::add);
		productRepository.findByDescriptionContainingIgnoreCase(text).forEach(products::add);
		
		return products.stream().distinct().collect(Collectors.toList());
		
//		return (new ArrayList(products));
	}
	
	@RequestMapping(value = "/api/v1/Product/{productId}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable("productId") final Long productId){
		return productRepository.findOne(productId);
	}
		
}
