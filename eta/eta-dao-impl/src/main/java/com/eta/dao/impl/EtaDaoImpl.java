package com.eta.dao.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eta.dao.api.EtaDaoApi;
import com.eta.dao.api.EtaDaoApiCrud;

import eta.com.domain.impl.EtaDetailsImpl;

@Repository
public class EtaDaoImpl  implements EtaDaoApiCrud{

/*	@Autowired
	EtaDaoApiCrud etaDaoApiCrud ;

	public void save(EtaDetailsImpl etaDetailsImpl) {
		etaDaoApiCrud.save(etaDetailsImpl);
	}
	
	public EtaDetailsImpl getDetails(Integer Id) {
		EtaDetailsImpl etaDetailsImpl13  = etaDaoApiCrud.findBySNo(Id);
		return etaDetailsImpl13;
	}
	
	public void getAllDetails() {
		List<EtaDetailsImpl> etaDetailsImpl = new ArrayList<EtaDetailsImpl>();
		etaDaoApiCrud.findAll().forEach(etaDetailsImpl::add);
	}

	public EtaDetailsImpl getDetailsByFirstName() {
		EtaDetailsImpl etaDetailsImpl12 = etaDaoApiCrud.findByFirstName("fName");
		return etaDetailsImpl12;
	}*/
}
