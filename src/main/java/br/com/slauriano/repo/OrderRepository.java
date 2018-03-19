package br.com.slauriano.repo;


import org.springframework.data.repository.CrudRepository;

import br.com.slauriano.model.OrderCustomer;

public interface OrderRepository extends CrudRepository<OrderCustomer, Long> {

}

