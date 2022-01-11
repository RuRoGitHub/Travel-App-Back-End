package com.bae.travelapp.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;

@Entity
public class Destination {

	@Id // Sets Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Sets Auto Increment

	private int id;
	private String cityName;
	private String countryName;
	private String visitTime;
	private String recommendedPlaces;
	private double conversionRate;
	
	public Destination(Integer id, String cityName, String countryName, String visitTime, String recommendedPlaces, double conversionRate) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.countryName = countryName;
		this.visitTime = visitTime;
		this.recommendedPlaces = recommendedPlaces;
		this.conversionRate = conversionRate;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getVisitTime() {
		return visitTime;
	}
	public void setVisitTime(String visitTime) {
		this.visitTime = visitTime;
	}
	public String getRecommenedPlaces() {
		return recommendedPlaces;
	}
	public void setRecommenedPlaces(String recommendedPlaces) {
		this.recommendedPlaces = recommendedPlaces;
	}
	public double getConversionRate() {
		return conversionRate;
	}
	public void setConversionRate(double conversionRate) {
		this.conversionRate = conversionRate;
	}
	public Object getAllDestinations() {
		// TODO Auto-generated method stub
		return null;
	}
	public Destination createDestination(Destination destination) {
		// TODO Auto-generated method stub
		return null;
	}
	public Destination getDestination(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void removeDestination(Integer id) {
		// TODO Auto-generated method stub
		
	}
	public Destination replaceDestination(Integer id, Destination newDestination) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Destination> getAllDestinationsByCountryName(String countryName) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Destination> getAllDestinationsByCityName(String cityName) {
		return null;
	}
	public Object getRecommendedPlaces() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setRecommendedPlaces(Object recommendedPlaces2) {
		// TODO Auto-generated method stub
		
	}

}
