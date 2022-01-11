package com.bae.travelapp.service;

import java.util.List;

import com.bae.travelapp.domain.Destination;

public interface service {
	
	Destination createDestination(Destination destination);
	
	List<Destination> getAllDestinations();

	List<Destination> getAllDestinationsByCityName(String cityName);

	List<Destination> getAllDestinationsByCountryName(String countryName);

	

	Destination getDestination(Integer id);

	Destination replaceDestination(Integer id, Destination newDestination);

	void removeDestinations(Integer id);

}