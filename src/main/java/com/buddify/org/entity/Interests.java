package com.buddify.org.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Interests {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer interestsId;
	
	private String interestsName;

	public Integer getInterestsId() {
		return interestsId;
	}

	public void setInterestsId(Integer interestsId) {
		this.interestsId = interestsId;
	}

	public String getInterestsName() {
		return interestsName;
	}

	public void setInterestsName(String interestsName) {
		this.interestsName = interestsName;
	}

}
