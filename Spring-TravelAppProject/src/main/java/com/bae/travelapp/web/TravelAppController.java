package com.bae.travelapp.web;

import java.util.List;

import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.travelapp.*;
import com.bae.travelapp.domain.Destination;

@CrossOrigin
@RestController
public class TravelAppController {

	private Destination service;
	
	@Autowired
	
	public TravelAppController(Destination service) {
		super();
		this.service = service;
}
	//GET ALL DESTINATIONS
		@GetMapping("/getAll") // 200 - Ok
		public ResponseEntity<Object> getAllDestinations() {
			return ResponseEntity.ok(this.service.getAllDestinations());
		}


		//GET DESTINATION BY ID
		@GetMapping("/get/{id}") // 200 - Ok
		public Destination getDestination(@PathVariable Integer id) {
			return this.service.getDestination(id);
		}
		
		//GET DESTINATION BY CITY NAME
			@GetMapping("/getByCityName/{cityName}")
			public <CityName> ResponseEntity<List<Destination>> getDestinationByCityName(@PathVariable String cityName) {
				List<Destination> found = this.service.getAllDestinationsByCityName(cityName);
				return ResponseEntity.ok(found);
			}
			
			//GET DESTINATION BY COUNTRY NAME
			@GetMapping("/getByCountryName/{countryName}")
			public ResponseEntity<List<Destination>> getDestinationByCountryName(@PathVariable String countryName) {
				List<Destination> found = this.service.getAllDestinationsByCountryName(countryName);
				return ResponseEntity.ok(found);
			}
	//CREATE DESTINATION
	@PostMapping("/create") // 201 - Created
	public ResponseEntity<Destination> createDestination(@RequestBody Destination destination) {
		Destination created = this.service.createDestination(destination);
	ResponseEntity<Destination> response = new ResponseEntity<Destination>(created, HttpStatus.CREATED);
		return response;
}	
		
	//UPDATE THE DESTINATION
	@PutMapping("/replace/{id}") // 202 - Accepted
	public ResponseEntity<Destination> replaceDestination(@PathVariable Integer id, @RequestBody Destination newDestination) {
		Destination body = this.service.replaceDestination(id, newDestination);
		ResponseEntity<Destination> response = new ResponseEntity<Destination>(body, HttpStatus.ACCEPTED);
		return response;
}
	
	//DELETE THE DESTINATION
	@DeleteMapping("/remove/{id}") // 204 - No Content
	public ResponseEntity<?> removeDestination(@PathVariable Integer id) {
		this.service.removeDestination(id);
		return new ResponseEntity<Destination>(HttpStatus.NO_CONTENT);
	}
	
}