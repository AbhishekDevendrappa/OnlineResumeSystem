package com.ors.model;


public class PasswordReset {
	
	
	public PasswordReset() {
		// TODO Auto-generated constructor stub
	}
	
	private String Username;
	private String newpassword;
	private String confirmpassword;
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	@Override
	public String toString() {
		return "PasswordReset [Username=" + Username + ", newpassword=" + newpassword + ", confirmpassword="
				+ confirmpassword + "]";
	}
	public PasswordReset(String username, String newpassword, String confirmpassword) {
		super();
		Username = username;
		this.newpassword = newpassword;
		this.confirmpassword = confirmpassword;
	}

}
