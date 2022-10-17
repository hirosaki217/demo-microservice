package spring.services.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import spring.services.entity.Student;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/students")
	public String getStudents(){
		HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<List<Student>> entity = new HttpEntity<List<Student>>(headers);
	      
	      return restTemplate.exchange(
	         "http://localhost:8080/students", HttpMethod.GET, entity, String.class).getBody();
		
	}
	@PostMapping("/student")
	public String createProducts(@RequestBody Student student) {
			System.out.println(student.toString());
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<Student> entity = new HttpEntity<Student>(student,headers);
	      
	      return restTemplate.exchange(
	         "http://localhost:8080/student", HttpMethod.POST, entity, String.class).getBody();
	   }
}
