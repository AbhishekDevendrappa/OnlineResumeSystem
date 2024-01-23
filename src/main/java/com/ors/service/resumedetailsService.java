 package com.ors.service;



import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ors.model.ResumeDetails;
import com.ors.model.User;
import com.ors.repo.Resumedetailsrepo;
@Service
public class resumedetailsService {
	
	@Autowired
	Resumedetailsrepo resumedetailsrepo;
	
	@Autowired
	HttpSession httpsession;
	
	public  String  saveUser(ResumeDetails u) {
		
		
		Integer count=resumedetailsrepo.total(u.getUser().getSlno());
		if(count==0) {
		resumedetailsrepo.save(u);
		return "";
		}
		else {
			return null;
		}
	}
	
	public ResumeDetails getbyId(Integer id){
		return resumedetailsrepo.getByUser(id);
	}

	public void Deleteuser(Integer id) {
		 resumedetailsrepo.deleteById(id);
	 }

	public String updateuser(ResumeDetails u) {
		resumedetailsrepo.save(u);
		return "";
		
	}

	public Optional<ResumeDetails> getbyIdd(Integer id) {
		return resumedetailsrepo.findById(id);
	}

	
	public ResumeDetails update(ResumeDetails details) {
		details.setUser((User)httpsession.getAttribute("id"));
		return resumedetailsrepo.save(details);
	}

	public ResumeDetails findResume(User user) {
		return resumedetailsrepo.findByUser(user);

		}
}
