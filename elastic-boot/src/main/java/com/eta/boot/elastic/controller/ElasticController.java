package com.eta.boot.elastic.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpHost;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ElasticController {

	@GetMapping("/helloelastic")
	public Object test() throws Exception {
		System.out.println("hi");
		RestClient restClient = RestClient.builder(
				new HttpHost("localhost", 9200, "http"),
				new HttpHost("localhost", 9205, "http")).build();

		Map<String, String> paramMap = new HashMap<String, String>();

		Response response = restClient.performRequest("GET", "/mkyong/posts/_search", paramMap);
		
		String aa = EntityUtils.toString(response.getEntity());
		return aa;
	}
}
