package com.ors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ors.model.Recuiter;
import com.ors.repo.Recuiterrepo;

@Service
public class RecuiterService {
	
	@Autowired
	Recuiterrepo recuiterrepo;

	public void saveRecuiter(Recuiter r) {
		recuiterrepo.save(r);
		
	}

	public Recuiter getrecuiter(String email, String password) {
		return recuiterrepo.getuser(email,password);
	}

}
