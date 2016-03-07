package com.buddify.org.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buddify.org.entity.Interests;
import com.buddify.org.entity.Venue;
import com.buddify.org.respository.VenueRepository;

@RestController
public class VenueCtrl {
	
	@Autowired
	private VenueRepository venueRepository;
	
	@RequestMapping("/venueSave")
	@Transactional
	public Venue venueSave() {
		
		Venue venue = new Venue();
		venue.setVenueLocation("london");
		venue.setVenueLongDescription("Capital of UK");
		venue.setVenueMood("Good");
		venue.setVenueName("BuddifyDrinks");
		venue.setVenueShortDescription("lon");
		venue.setVenueType("good to go");
		venue.setVenueWebsiteLink("www.london.com");
		List<Interests> interests = new ArrayList<Interests>();
		Interests interest = new Interests();
		interest.setInterestsName("Music");
		interests.add(interest);
		venue.setInterests(interests);
		venueRepository.save(venue);
		return venue;
		
	}

}
