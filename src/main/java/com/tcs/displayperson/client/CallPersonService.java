package com.tcs.displayperson.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CallPersonService {

	public String getPersonDetails() {
		
		RestTemplate restTemp=new RestTemplate();
		String personName=restTemp.getForObject("http://localhost:8080/personDetails",String.class);
		System.out.println(personName);
		return personName;
	}
}
