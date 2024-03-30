package com.ors.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recuiter {
	
	public Recuiter() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer slno;
	private String name;
	private String email;
	private String password;
	private Long Number;
	private String company;
	public Integer getSlno() {
		return slno;
	}
	public void setSlno(Integer slno) {
		this.slno = slno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getNumber() {
		return Number;
	}
	public void setNumber(Long number) {
		Number = number;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Recuiter(Integer slno, String name, String email, String password, Long number, String company) {
		super();
		this.slno = slno;
		this.name = name;
		this.email = email;
		this.password = password;
		Number = number;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Recuiter [slno=" + slno + ", name=" + name + ", email=" + email + ", password=" + password + ", Number="
				+ Number + ", company=" + company + "]";
	}
	
	

}
