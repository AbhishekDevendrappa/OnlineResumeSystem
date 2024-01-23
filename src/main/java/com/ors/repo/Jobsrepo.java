package com.ors.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ors.model.Jobs;

@Repository
public interface Jobsrepo extends JpaRepository<Jobs, Integer> {

	@Query("from com.ors.model.Jobs where jobtitle=:jobtitle")
	public List<Jobs> findByTitle(String jobtitle);

}
