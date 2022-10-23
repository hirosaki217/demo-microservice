package spring.gateway.app.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import spring.gateway.app.entity.User;

@RestController
public class UserController {
	@Autowired
	RestTemplate restTemplate;

	@PostMapping(value = "/login")
	public String login(@RequestBody User user) {
	   HttpHeaders headers = new HttpHeaders();
	   headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	   HttpEntity <User> entity = new HttpEntity<User>(user ,headers);
	   
	   return restTemplate.exchange("http://localhost:8081/login", 
			   HttpMethod.POST, entity, String.class).getBody();
	}
	@PostMapping(value = "/register")
	public User register(@RequestBody User user) {
	   HttpHeaders headers = new HttpHeaders();
	   headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	   HttpEntity <User> entity = new HttpEntity<User>(user ,headers);
	   
	   return restTemplate.exchange("http://localhost:8081/register", 
			   HttpMethod.POST, entity, User.class).getBody();
	}
}
