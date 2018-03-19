package br.com.slauriano.repoImpl;

import java.util.List;

import br.com.slauriano.model.Store;
import br.com.slauriano.repo.StoreRepository;

public class StoreRepositoryImpl implements StoreRepository{

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Store arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Store> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Store> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Store> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Store findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Store> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Store> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Store> findByCousineId(Long cousineId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Store> findByNameContainingIgnoreCase(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}
