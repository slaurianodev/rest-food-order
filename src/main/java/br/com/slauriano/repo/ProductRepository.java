package br.com.slauriano.repo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.slauriano.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findByStoreId(Long storeId);
	List<Product> findByNameContainingIgnoreCase(String name);
	List<Product> findByDescriptionContainingIgnoreCase(String description);
}

