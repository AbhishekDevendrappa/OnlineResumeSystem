package com.ors.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jobs {
	
	
	public Jobs() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer slno;
	private String company;
	private String jobtitle;
	private String jobdescription;
	private String joblocation;
	private String jobtype;
	
	public Integer getSlno() {
		return slno;
	}
	public void setSlno(Integer slno) {
		this.slno = slno;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getJobdescription() {
		return jobdescription;
	}
	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}
	public String getJoblocation() {
		return joblocation;
	}
	public void setJoblocation(String joblocation) {
		this.joblocation = joblocation;
	}
	public String getJobtype() {
		return jobtype;
	}
	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}
	@Override
	public String toString() {
		return "jobs [slno=" + slno + ", jobtitle=" + jobtitle + ", jobdescription=" + jobdescription + ", joblocation="
				+ joblocation + ", jobtype=" + jobtype + "]";
	}
	public Jobs(Integer slno, String jobtitle, String jobdescription, String joblocation, String jobtype) {
		super();
		this.slno = slno;
		this.jobtitle = jobtitle;
		this.jobdescription = jobdescription;
		this.joblocation = joblocation;
		this.jobtype = jobtype;
	}
	

}
