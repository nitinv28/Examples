package com.eta.dao.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eta.com.domain.impl.EtaDetailsImpl;


@Repository
public interface EtaDaoApiCrud  extends CrudRepository<EtaDetailsImpl, Integer>{

	public EtaDetailsImpl findByFirstName(String firstName);
	
	public EtaDetailsImpl findBySNo(Integer sNo);
	
	
}
