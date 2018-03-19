package br.com.slauriano.repoImpl;

import br.com.slauriano.model.OrderCustomer;
import br.com.slauriano.repo.OrderRepository;

public class OrderRepositoryImpl implements OrderRepository{

	@Override
	public <S extends OrderCustomer> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OrderCustomer> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderCustomer findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<OrderCustomer> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<OrderCustomer> findAll(Iterable<Long> ids) {
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
	public void delete(OrderCustomer entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends OrderCustomer> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	
}
