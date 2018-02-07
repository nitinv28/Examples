package com.eta.dao.api;

import eta.com.domain.impl.EtaDetailsImpl;

public interface EtaDaoApi {

	public void save (EtaDetailsImpl etaDetailsImpl);
	public EtaDetailsImpl getDetails(Integer id) ;
}
