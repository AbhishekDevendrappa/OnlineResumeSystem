package com.ors.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ors.model.User;
@Repository
public interface Userrepo extends CrudRepository<User ,Integer> {
     
	@Query("from User where Username=:Username and Password=:Password")
	public User getbyuser(String Username, String Password);

	public User findByusername(String username);

	
}

