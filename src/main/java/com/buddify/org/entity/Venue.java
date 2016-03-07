package com.buddify.org.entity;


import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Venue {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer venueId;
	private String venueName;
	private String venueShortDescription;
	private String venueLongDescription;
	private byte[] venuePicture;	
	private String venueLikes;
	private String venueWebsiteLink;
	private String venueLocation;
	private String venueType;
	
	@Override
	public String toString() {
		return "Venue [venueId=" + venueId + ", venueName=" + venueName + ", venueShortDescription="
				+ venueShortDescription + ", venueLongDescription=" + venueLongDescription + ", venuePicture="
				+ Arrays.toString(venuePicture) + ", venueLikes=" + venueLikes + ", venueWebsiteLink="
				+ venueWebsiteLink + ", venueLocation=" + venueLocation + ", venueType=" + venueType + ", interests="
				+ interests + ", venueMood=" + venueMood + "]";
	}
	@OneToMany(cascade={CascadeType.ALL})
	private Collection<Interests> interests;
	
	
	public Collection<Interests> getInterests() {
		return interests;
	}
	public void setInterests(Collection<Interests> interests) {
		this.interests = interests;
	}
	public Integer getVenueId() {
		return venueId;
	}
	public void setVenueId(Integer venueId) {
		this.venueId = venueId;
	}
	public String getVenueName() {
		return venueName;
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	public String getVenueShortDescription() {
		return venueShortDescription;
	}
	public void setVenueShortDescription(String venueShortDescription) {
		this.venueShortDescription = venueShortDescription;
	}
	public String getVenueLongDescription() {
		return venueLongDescription;
	}
	public void setVenueLongDescription(String venueLongDescription) {
		this.venueLongDescription = venueLongDescription;
	}
	public byte[] getVenuePicture() {
		return venuePicture;
	}
	public void setVenuePicture(byte[] venuePicture) {
		this.venuePicture = venuePicture;
	}
	public String getVenueLikes() {
		return venueLikes;
	}
	public void setVenueLikes(String venueLikes) {
		this.venueLikes = venueLikes;
	}
	public String getVenueWebsiteLink() {
		return venueWebsiteLink;
	}
	public void setVenueWebsiteLink(String venueWebsiteLink) {
		this.venueWebsiteLink = venueWebsiteLink;
	}
	public String getVenueLocation() {
		return venueLocation;
	}
	public void setVenueLocation(String venueLocation) {
		this.venueLocation = venueLocation;
	}
	public String getVenueType() {
		return venueType;
	}
	public void setVenueType(String venueType) {
		this.venueType = venueType;
	}
	public String getVenueMood() {
		return venueMood;
	}
	public void setVenueMood(String venueMood) {
		this.venueMood = venueMood;
	}
	private String venueMood;

	

}
