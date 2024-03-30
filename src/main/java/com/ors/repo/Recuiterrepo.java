package com.ors.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ors.model.Recuiter;

public interface Recuiterrepo extends CrudRepository<Recuiter, Integer> {

	@Query("from Recuiter where email=:email and password=:password")
	public Recuiter getuser(String email, String password);

}
