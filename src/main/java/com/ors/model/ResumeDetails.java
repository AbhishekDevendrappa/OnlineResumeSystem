package com.ors.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ResumeDetails {
	
	public ResumeDetails() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer slno;
	private String firstname;
	private String lastname;
	private String email;
	private Long contactnumber;
	private Date dateofbirth;
	private String gender;
	private String totalexperience;
	private String cityapplying;
	private Integer tenthpercentage;
	private Integer twelvethpercentage;
	private String highestqualification;
	private Integer yearofhighestqualification;
	private String currentCompany;
	private String currentDesignation;
	private Integer currentCTC;
	
	@OneToOne
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getSlno() {
		return slno;
	}
	public void setSlno(Integer slno) {
		this.slno = slno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(Long contactnumber) {
		this.contactnumber = contactnumber;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTotalexperience() {
		return totalexperience;
	}
	public void setTotalexperience(String totalexperience) {
		this.totalexperience = totalexperience;
	}
	public String getCityapplying() {
		return cityapplying;
	}
	public void setCityapplying(String cityapplying) {
		this.cityapplying = cityapplying;
	}
	public Integer gettenthpercentage() {
		return tenthpercentage;
	}
	public void settenthpercentage(Integer tenthpercentage) {
		this.tenthpercentage = tenthpercentage;
	}
	public Integer getTwelvethpercentage() {
		return twelvethpercentage;
	}
	public void setTwelvethpercentage(Integer twelvethpercentage) {
		this.twelvethpercentage = twelvethpercentage;
	}
	public String getHighestqualification() {
		return highestqualification;
	}
	public void setHighestqualification(String highestqualification) {
		this.highestqualification = highestqualification;
	}
	public Integer getYearofhighestqualification() {
		return yearofhighestqualification;
	}
	public void setYearofhighestqualification(Integer yearofhighestqualification) {
		this.yearofhighestqualification = yearofhighestqualification;
	}
	public String getCurrentCompany() {
		return currentCompany;
	}
	public void setCurrentCompany(String currentCompany) {
		this.currentCompany = currentCompany;
	}
	public String getCurrentDesignation() {
		return currentDesignation;
	}
	public void setCurrentDesignation(String currentDesignation) {
		this.currentDesignation = currentDesignation;
	}
	public Integer getCurrentCTC() {
		return currentCTC;
	}
	public void setCurrentCTC(Integer currentCTC) {
		this.currentCTC = currentCTC;
	}
	@Override
	public String toString() {
		return "ResumeDetails [slno=" + slno + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", contactnumber=" + contactnumber + ", dateofbirth=" + dateofbirth + ", gender=" + gender
				+ ", totalexperience=" + totalexperience + ", cityapplying=" + cityapplying + ", tenthpercentage="
				+ tenthpercentage + ", twelvethpercentage=" + twelvethpercentage + ", highestqualification="
				+ highestqualification + ", yearofhighestqualification=" + yearofhighestqualification
				+ ", currentCompany=" + currentCompany + ", currentDesignation=" + currentDesignation + ", currentCTC="
				+ currentCTC + "]";
	}
	public ResumeDetails(Integer slno, String firstname, String lastname, String email, Long contactnumber,
			Date dateofbirth, String gender, String totalexperience, String cityapplying, Integer tenthpercentage,
			Integer twelvethpercentage, String highestqualification, Integer yearofhighestqualification,
			String currentCompany, String currentDesignation, Integer currentCTC) {
		super();
		this.slno = slno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.contactnumber = contactnumber;
		this.dateofbirth = dateofbirth;
		this.gender = gender;
		this.totalexperience = totalexperience;
		this.cityapplying = cityapplying;
		this.tenthpercentage = tenthpercentage;
		this.twelvethpercentage = twelvethpercentage;
		this.highestqualification = highestqualification;
		this.yearofhighestqualification = yearofhighestqualification;
		this.currentCompany = currentCompany;
		this.currentDesignation = currentDesignation;
		this.currentCTC = currentCTC;
	}

}

