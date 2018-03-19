package br.com.slauriano.repoImpl;

import java.util.List;

import br.com.slauriano.model.OrderItem;
import br.com.slauriano.repo.OrderItemRepository;

public class OrderItemRepositoryImpl implements OrderItemRepository{

	@Override
	public <S extends OrderItem> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends OrderItem> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItem findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<OrderItem> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<OrderItem> findAll(Iterable<Long> ids) {
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
	public void delete(OrderItem entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends OrderItem> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderItem> findByOrderId(Long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
