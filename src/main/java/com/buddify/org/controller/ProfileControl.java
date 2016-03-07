package com.buddify.org.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buddify.org.entity.Interests;
import com.buddify.org.entity.Profile;
import com.buddify.org.respository.ProfileRepository;

@RestController
public class ProfileControl {

	
	@Autowired
	private ProfileRepository profileRepo;

	@RequestMapping("/profile")
	public Profile greeting() {
		Profile profile = new Profile();
		profile.setName("ram");
		profileRepo.save(profile);
		return profile;
	}
	
	@RequestMapping("/profileSave")
	@Transactional
	public Profile profileSave() {
		Profile profile = new Profile();
		
		profile.setContactNo(8411911414d);
		profile.setDob(new Date());
		profile.setEmailId("programarunesh@gmail.com");
		profile.setName("name1");
		List<Interests> interestList = new ArrayList<Interests>();
		Interests interest1 = new Interests();
		interest1.setInterestsName("Music");
		interestList.add(interest1);
		Interests interest2 = new Interests();
		interest2.setInterestsName("Drinks");
		interestList.add(interest2);
		profile.setInterest(interestList);
		profileRepo.save(profile);
		return profile;
		
	}

}
