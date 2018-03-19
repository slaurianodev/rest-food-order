package br.com.slauriano.repo;


import org.springframework.data.repository.CrudRepository;

import br.com.slauriano.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	Customer findByEmailAndPassword(String email, String password);
}

