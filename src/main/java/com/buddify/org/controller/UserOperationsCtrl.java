package com.buddify.org.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.buddify.org.dto.UserVenueDTO;
import com.buddify.org.entity.Interests;
import com.buddify.org.entity.Profile;
import com.buddify.org.entity.Venue;
import com.buddify.org.respository.ProfileRepository;
import com.buddify.org.respository.VenueRepository;

@RestController
public class UserOperationsCtrl {

	@Autowired
	private VenueRepository venueRepository;

	@Autowired
	private ProfileRepository profileRepo;

	@RequestMapping(value = "/fetchUserVenues", method = RequestMethod.GET)
	@Transactional
	public UserVenueDTO fetchUserVenues(@RequestHeader(value = "email") String email) {

		// fetch interest from profile
		Profile profiles = profileRepo.findByEmailId(email);
		List<Interests> interests = profiles.getInterest();
		UserVenueDTO userVenueDTO = new UserVenueDTO();
		for (Interests interestsTemp : interests) {
			System.out.println("Interest are::" + interestsTemp.getInterestsName());
			List<Venue> venues = venueRepository.findByVenueByInterests(interestsTemp.getInterestsName());
			for (Venue venue : venues) {
				System.out.println("Venues are::" + venue.toString());
				userVenueDTO.setVenues(venues);
			}
		}

		return userVenueDTO;

	}

}
