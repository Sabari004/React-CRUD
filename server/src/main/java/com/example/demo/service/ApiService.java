package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Gainers;
import com.example.demo.repository.GainersRepo;
@Service
public class ApiService {
	@Autowired
	GainersRepo service;
	public List<Gainers> getEvent(){
		return service.findAll();
	}
	public String addEvent(Gainers s) {
		service.save(s);
		return "Event is added";
	}
	public Optional<Gainers> getIdEvent(int s){
		return service.findById(s);
	}
	public String deleteEvent(int s) {
		service.deleteById(s);
		return "Deleted";
	}
	public String putEvent (Gainers s) {
		service.save(s);
		return "Event is updated";
	}
}
