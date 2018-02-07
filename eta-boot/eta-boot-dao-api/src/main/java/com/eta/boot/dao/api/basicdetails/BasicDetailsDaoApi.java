package com.eta.boot.dao.api.basicdetails;

import com.eta.boot.domain.impl.basicdetails.BasicDetails;


public interface BasicDetailsDaoApi {

	public void save (BasicDetails basicDetails);
	public BasicDetails getDetails(Integer id) ;
}
