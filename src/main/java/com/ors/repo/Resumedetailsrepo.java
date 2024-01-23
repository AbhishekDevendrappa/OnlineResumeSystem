package com.ors.repo;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ors.model.ResumeDetails;
import com.ors.model.User;

@Repository
public interface Resumedetailsrepo extends CrudRepository<ResumeDetails, Integer> {
		
	@Query(" from  com.ors.model.ResumeDetails where user.slno=:uid")
	public ResumeDetails getByUser(Integer uid);

	@Query("select count(*) from com.ors.model.ResumeDetails where user.slno=:uid" )
    public Integer total(Integer uid);

	public ResumeDetails findByUser(User user);



}
