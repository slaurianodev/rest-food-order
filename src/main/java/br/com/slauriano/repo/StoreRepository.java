package br.com.slauriano.repo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.slauriano.model.Store;

public interface StoreRepository extends CrudRepository<Store, Long> {
	List<Store> findByCousineId(Long cousineId);

	List<Store> findByNameContainingIgnoreCase(String name);
}

