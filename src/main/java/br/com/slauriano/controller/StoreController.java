package br.com.slauriano.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.slauriano.model.Product;
import br.com.slauriano.model.Store;
import br.com.slauriano.repo.ProductRepository;
import br.com.slauriano.repo.StoreRepository;

@RestController
public class StoreController {

	@Autowired
	private StoreRepository storeRepository;
	
	@Autowired
	private ProductRepository productRepostitory;

	@RequestMapping(value = "/api/v1/Store", method = RequestMethod.GET)
	public List<Store> getStores() {
		List<Store> stores = new ArrayList<>();
		storeRepository.findAll().forEach(stores::add);
		return stores;		
	}

	@RequestMapping(value = "/api/v1/Store/search/{searchText}", method = RequestMethod.GET)
	public List<Store> getStoresByName(@PathVariable("searchText") final String name){
		return storeRepository.findByNameContainingIgnoreCase(name);
	}
	
	@RequestMapping(value = "/api/v1/Store/{storeId}", method = RequestMethod.GET)
	public Store getStoresById(@PathVariable("storeId") final Long storeId){
		return storeRepository.findOne(storeId);
	}
	
	@RequestMapping(value = "/api/v1/Store/{storeId}/products", method = RequestMethod.GET)
	public List<Product> getProductsByStoreId(@PathVariable("storeId") final Long storeId){
		return productRepostitory.findByStoreId(storeId);
	}
}
