package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Gainers;
import com.example.demo.service.ApiService;
@RestController
@CrossOrigin
public class ApiController {
	@Autowired
	ApiService service;
	
	@PostMapping("/gainers")
	public String add(@RequestBody Gainers s) {
		return service.addEvent(s);
	}
	@GetMapping("/gainers")
	public List<Gainers> get(){
		return service.getEvent();
	}
	@GetMapping("/gainers/{id}")
	public Optional<Gainers> getId(@PathVariable int id){
		return service.getIdEvent(id);
	}
	@PutMapping("/gainers")
	public String put(@RequestBody Gainers s) {
		return service.putEvent(s);
	}
	@DeleteMapping("/gainers/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteEvent(id);
	}
	
	
	
}
