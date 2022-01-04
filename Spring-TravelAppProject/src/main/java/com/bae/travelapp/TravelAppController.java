package com.bae.travelapp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Index;

import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 

public class TravelAppController {

	private List<Destination> destin = new ArrayList<>();
	
	@GetMapping("/welcomeApp") // 200 - Ok
public String welcome() {
	return "Welcome to Ru's Travel App!";
}
	
	@PostMapping("/create") // 201 - Created
	public ResponseEntity<Destination> createDestination(@RequestBody Destination destin) {
		this.destin.add(destin);
		Destination created = this.destin.get(this.destin.size() - 1);
	ResponseEntity<Destination> response = new ResponseEntity<Destination>(created, HttpStatus.CREATED);
		return response;
}
	
	@GetMapping("/getAll") // 200 - Ok
	public List<Destination> getAllDestin() {
		return this.destin; 
	}
	
	@GetMapping("/get/{id}") // 200 - Ok
	public Destination getDestin(@PathVariable Integer id) {
		System.out.println("ID: " + id);
		return this.destin.get(id);
	}
	
	@PutMapping("/replace/{id}") // 202 - Accepted
	public ResponseEntity<Destination> replaceDestin(@PathVariable Integer id, @RequestBody Destination newDestin) {
		Destination body = this.destin.set(id, newDestin);
		ResponseEntity<Destination> response = new ResponseEntity<Destination>(body, HttpStatus.ACCEPTED);
		return response;
}
	@DeleteMapping("/remove/{id}") // 204 - No Content
	public ResponseEntity<Destination> removeDestin(@PathVariable Integer id) {
		System.out.println("ID: " + id);
		this.destin.remove(id.intValue());
		return new ResponseEntity<Destination>(HttpStatus.NO_CONTENT);
	}
	
}