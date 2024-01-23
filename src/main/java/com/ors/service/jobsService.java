package com.ors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ors.model.Jobs;
import com.ors.repo.Jobsrepo;

@Service
public class jobsService {
	
	@Autowired
	Jobsrepo jobsrepo;

	public void saveJobs(Jobs u) {
		jobsrepo.save(u);
		
	}

	public  List<Jobs> getAllJobs() {
		 return jobsrepo.findAll();
	}

	public List<Jobs> getByTitle(String jobtitle){
		return (List<Jobs>)jobsrepo.findByTitle(jobtitle);
	}

	public List<Jobs> getAllJob() {
		return (List<Jobs>)jobsrepo.findAll();
	}


}
