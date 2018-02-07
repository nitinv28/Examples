package com.eta.boot.dao.impl.basicdetails;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eta.boot.dao.api.basicdetails.BasicDetailsDaoApi;
import com.eta.boot.dao.api.basicdetails.BasicDetailsDaoCurd;
import com.eta.boot.domain.impl.basicdetails.BasicDetails;


@Repository
public class BasicDetailsDaoImpl  implements BasicDetailsDaoApi{

	@Autowired
	BasicDetailsDaoCurd basicDetailsDaoCurd ;

	public void save(BasicDetails basicDetails) {
		basicDetailsDaoCurd.save(basicDetails);
	}
	
	public BasicDetails getDetails(Integer Id) {
		System.out.println("sno >>> "+Id);
		BasicDetails basicDetails  = basicDetailsDaoCurd.findBySNo(Id);
		return basicDetails;
	}
	
	public void getAllDetails() {
		List<BasicDetails> basicDetailsList = new ArrayList<BasicDetails>();
		basicDetailsDaoCurd.findAll().forEach(basicDetailsList::add);
	}

	public BasicDetails getDetailsByFirstName() {
		BasicDetails basicDetails = basicDetailsDaoCurd.findByFirstName("fName");
		return basicDetails;
	}

}
