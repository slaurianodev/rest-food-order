package br.com.slauriano.repo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.slauriano.model.OrderItem;

public interface OrderItemRepository extends CrudRepository<OrderItem, Long> {
	List<OrderItem> findByOrderId(Long orderId);
}

