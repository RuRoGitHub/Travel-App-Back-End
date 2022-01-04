package com.bae.travelapp;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class Destination {

	private String cityName;
	private String countryName;
	private String visitTime;
	private String recommenedPlaces;
	private String conversionRate;
	
	public Destination() {
		super();
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
		return recommenedPlaces;
	}
	public void setRecommenedPlaces(String recommenedPlaces) {
		this.recommenedPlaces = recommenedPlaces;
	}
	public String getConversionRate() {
		return conversionRate;
	}
	public void setConversionRate(String conversionRate) {
		this.conversionRate = conversionRate;
	}
}
