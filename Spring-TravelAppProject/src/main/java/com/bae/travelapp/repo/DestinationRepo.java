package com.bae.travelapp.repo;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.travelapp.domain.Destination;

@Repository
public interface DestinationRepo extends JpaRepository<Destination, Integer> {

	List<Destination> findByCityNameIgnoreCase(String cityName);

	List<Destination> findByCountryNameIgnoreCase(String countryName);

}