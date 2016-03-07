package com.buddify.org.respository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buddify.org.entity.Profile;


public interface ProfileRepository extends CrudRepository<Profile, Integer>{
	
	@Query("SELECT p FROM Profile p where p.emailId = :emailId") 
	Profile findByEmailId(@Param("emailId") String emailId);

}
