package br.com.slauriano.repoImpl;

import java.util.List;

import br.com.slauriano.model.Product;
import br.com.slauriano.repo.ProductRepository;

public class ProductRepositoryImpl implements ProductRepository{

	@Override
	public <S extends Product> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Product> findAll(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Product> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> findByStoreId(Long storeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByNameContainingIgnoreCase(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByDescriptionContainingIgnoreCase(String description) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
