package com.bae.travelapp.service;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.travelapp.domain.Destination;
import com.bae.travelapp.repo.DestinationRepo;

@Service
public class ServiceDB implements Service {
	
private DestinationRepo repo;
@Autowired
public ServiceDB(DestinationRepo repo) {
	super();
	this.repo = repo;
}

//CREATE DESTINATION
public Destination createDestination(Destination destination) {
	Destination created = this.repo.save(destination);
	return created;
}

//GET ALL DESTINATIONS
public List<Destination> getAllDestinations() {
	return this.repo.findAll();
}

//GET ALL DESTINATIONS BY CITY NAME	
public List<Destination> getAllDestinationsByCityName(String cityName) {
	List<Destination> found = this.repo.findByCityNameIgnoreCase(cityName);
	return found;
}

//GET ALL DESTINATIONS BY COUNTRY NAME
public List<Destination> getAllDestinationsByCountryName(String countryName) {
	List<Destination> found = this.repo.findByCountryNameIgnoreCase(countryName);
	return found;
}

//GET BY ID
public Destination getDestination(Integer id) {
	Optional<Destination> found = this.repo.findById(id);
	return found.get();
}

//UPDATE DESTINATION
public Destination replaceDestination(Integer id, Destination newDestination) {
Destination existing = this.repo.findById(id).get();

	existing.setCityName(newDestination.getCityName());
	existing.setCountryName(newDestination.getCountryName());
	existing.setVisitTime(newDestination.getVisitTime());
	existing.setRecommendedPlaces(newDestination.getRecommendedPlaces());
	existing.setConversionRate(newDestination.getConversionRate());
	Destination updated = this.repo.save(existing);
	return updated;
}
public void removeDestination(Integer id) {
	this.repo.deleteById(id);
}

@Override
public Class<? extends Annotation> annotationType() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String value() {
	// TODO Auto-generated method stub
	return null;
}
}
