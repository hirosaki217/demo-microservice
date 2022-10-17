package spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import spring.crud.entity.Student;
import spring.crud.repository.StudentRepository;

@RestController
public class StudentCotroller {
	@Autowired
	StudentRepository repository;
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStudents(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping ("/student")
	public Student save(@RequestBody Student student) {
		System.out.println(student.toString());
		return repository.save(student);
		
	}
}
