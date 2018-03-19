package br.com.slauriano.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.slauriano.model.Cousine;
import br.com.slauriano.model.Store;
import br.com.slauriano.repo.CousineRepository;
import br.com.slauriano.repo.StoreRepository;

@RestController
public class CousineController {

	@Autowired
	private CousineRepository cousineRepository;
	
	@Autowired
	private StoreRepository storeRepository;

	@RequestMapping(value = "/api/v1/Cousine", method = RequestMethod.GET)
	public List<Cousine> getCousines() {
		List<Cousine> cousines = new ArrayList<>();
		cousineRepository.findAll().forEach(cousines::add);
		return cousines;		
	}

	@RequestMapping(value = "/api/v1/Cousine/search/{searchText}", method = RequestMethod.GET)
	public List<Cousine> getCousinesByName(@PathVariable("searchText") final String name){
		return cousineRepository.findByNameContainingIgnoreCase(name);
	}
	
	@RequestMapping(value = "/api/v1/Cousine/{cousineId}/stores", method = RequestMethod.GET)
	public List<Store> getStoresByCousineId(@PathVariable("cousineId") final Long cousineId){
		return storeRepository.findByCousineId(cousineId);
	}

}
