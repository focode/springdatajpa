package com.buddify.org.respository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.buddify.org.entity.Venue;

public interface VenueRepository extends CrudRepository<Venue, Integer>{
	
	@Query("SELECT v FROM Venue v, Interests i where i.interestsName = :interest") 
	List<Venue> findByVenueByInterests(@Param("interest") String interest);
	
	

}
