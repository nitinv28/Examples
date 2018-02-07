package com.eta.boot.dao.api.basicdetails;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eta.boot.domain.impl.basicdetails.BasicDetails;



@Repository
public interface BasicDetailsDaoCurd  extends CrudRepository<BasicDetails, Integer>{

	public BasicDetails findByFirstName(String firstName);
	
	public BasicDetails findBySNo(Integer sNo);
	
}
