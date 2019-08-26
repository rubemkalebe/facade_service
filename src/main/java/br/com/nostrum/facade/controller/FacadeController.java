package br.com.nostrum.facade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FacadeController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/welcome")
	public String welcome() {
		return restTemplate.getForObject("http://hello-service-app:8888/hello", String.class);
	}
	
}
