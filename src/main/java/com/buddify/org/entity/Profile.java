package com.buddify.org.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.CascadeType;

@Entity
public class Profile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer profileId;
	
	private String name;
	private String emailId;
	private Date dob;
	private byte[]profilePic;
	private Double contactNo;
	
	@OneToMany(cascade={CascadeType.ALL})
	private List<Interests> interest;
	
	

	public List<Interests> getInterest() {
		return interest;
	}

	public void setInterest(List<Interests> interest) {
		this.interest = interest;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public byte[] getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
	}

	public Double getContactNo() {
		return contactNo;
	}

	public void setContactNo(Double contactNo) {
		this.contactNo = contactNo;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
