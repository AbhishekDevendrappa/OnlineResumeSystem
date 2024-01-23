package com.ors.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ors.model.User;
import com.ors.repo.Userrepo;
@Service
public class userService {
	@Autowired
	Userrepo userrepo;

	public void saveUser(User u) {
		userrepo.save(u);
	}

	public User getUser(String username, String password) {
		return userrepo.getbyuser(username, password);
	}
	
	public User getUserById(Integer id) {
		Optional<User> o= userrepo.findById(id);
		if(o.isPresent())
			return o.get();
		return null;
	}

	public User findByname(String username) {
		return userrepo.findByusername(username);
	}	 
}
