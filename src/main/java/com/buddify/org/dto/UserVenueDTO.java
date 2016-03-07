package com.buddify.org.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import com.buddify.org.entity.Interests;
import com.buddify.org.entity.Venue;

public class UserVenueDTO {
	
	List<Venue> venues;

	public List<Venue> getVenues() {
		return venues;
	}

	public void setVenues(List<Venue> venues) {
		this.venues = venues;
	}

}
