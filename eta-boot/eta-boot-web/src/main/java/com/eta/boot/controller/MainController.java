package com.eta.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.eta.boot.domain.impl.basicdetails.BasicDetails;
import com.eta.boot.services.api.BasicDetailsServices;

@RestController
public class MainController {

	@Autowired
	BasicDetailsServices basicDetailsServices;
	
	@GetMapping("/getDetails/{id}")
	public Object getDetails(@PathVariable final Integer id) throws Exception {
		System.out.println("***hi**");
		BasicDetails basicDeatils = basicDetailsServices.getBasicInformation(id);
		
		return basicDeatils.getFirstName();
		
	}
	@GetMapping("/getDetailsEl/{id}")
	public Object test(@PathVariable final Integer id) throws Exception {
		System.out.println("***hi**");
		BasicDetails basicDeatils = basicDetailsServices.getBasicInformation(id);
		
		RestTemplate restTemplate = new RestTemplate();
		String aa = restTemplate.getForObject("http://localhost:8088/helloelastic", String.class);
		
		return basicDeatils.getFirstName()+"-"+aa;
		
	}
}
