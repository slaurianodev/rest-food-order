package br.com.slauriano.repo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.slauriano.model.Cousine;

public interface CousineRepository extends CrudRepository<Cousine, Long> {
	List<Cousine> findByNameContainingIgnoreCase(String name);
}

