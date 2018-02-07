package com.eta.boot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.eta.boot.dao.api.basicdetails.BasicDetailsDaoApi;
import com.eta.boot.domain.impl.basicdetails.BasicDetails;
import com.eta.boot.services.api.BasicDetailsServices;

@Service
@Component
public class BasicDetailsServicesImpl implements BasicDetailsServices{

	@Autowired
	BasicDetailsDaoApi basicDetailsDaoApi;
	@Override
	public BasicDetails getBasicInformation(Integer sNO) {
		 
		return basicDetailsDaoApi.getDetails(sNO);
	}
}
