package eta.com.controller;

import java.io.IOException;

import jdk.nashorn.internal.objects.annotations.Getter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.codehaus.jettison.json.JSONException;

import com.fasterxml.jackson.databind.ObjectMapper;

import eta.com.domin.api.details.EtaDetails;
import eta.com.services.api.EtaServicesApi;

@RestController
public class EtaController {

	@Autowired
	EtaServicesApi etaServicesApi;
	private static ObjectMapper objectMapper = new ObjectMapper();
	
	@RequestMapping(value = "/getDetails", method = RequestMethod.GET)
	public @ResponseBody Object hello() throws JSONException, IOException {
		EtaDetails etaDetails =etaServicesApi.getDetails(1);
		return toJson(etaDetails);
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public @ResponseBody Object saveData() throws JSONException, IOException {
		EtaDetails etaDetails = new EtaDetails();
		etaDetails.setId(0);
		etaDetails.setFirstName("fName");
		etaDetails.setLastName("lName");
		System.out.println("save Data");
		etaServicesApi.saveData(etaDetails);
		
		return "ok";
	}
	
	public Object toJson(Object object) throws JSONException, IOException{
		String jsonInString = objectMapper.writeValueAsString(object);
		return jsonInString;
	}
	
}
