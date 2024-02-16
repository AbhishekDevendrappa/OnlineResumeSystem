package com.ors.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.ors.model.Jobs;
import com.ors.model.PasswordReset;
import com.ors.model.ResumeDetails;
import com.ors.model.User;
import com.ors.service.MailSenderService;
import com.ors.service.jobsService;
import com.ors.service.resumedetailsService;
import com.ors.service.userService;

@Controller
public class MainController {
	@Autowired
	userService userservice;
	
	@Autowired
	resumedetailsService resumedetailsservice;
	
	@Autowired
	jobsService jobsservice;
	
	@Autowired
	HttpSession httpsession;
	
	@Autowired
	MailSenderService mailSenderService;

	@GetMapping
	public String home()
	{
		return "home";
	}
	
	@GetMapping("register")
	public String showregister()
	{
		return "register";
	}
	
	@GetMapping("login")
	public String showlogin()
	{
		return "login";
	}
	
	
	@GetMapping("gohome")
	public String  gohome() {
		return "home";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String register(@ModelAttribute("u") User u,ModelMap model) {
		userservice.saveUser(u);
		    mailSenderService.sendEmailregistration("abhisd2000@gmail.com", "Registration to ORS", "Registration Sucessfully Done.....",u.getUsername(),u.getPassword());
			model.put("registerMsg", "User registered successfully");
		return "Afterregister";
	}
	
	@PostMapping("/login")
	public String Mainpage(ModelMap model, @RequestParam String Username, @RequestParam String Password,HttpSession s) {
		User user = userservice.getUser(Username, Password);
		String a = Username;
		model.put("um", a);
		if(user!=null) {		
			s.setAttribute("id", user);
			mailSenderService.sendEmaillogin("abhisd2000@gmail.com", "login to ORS", "Login Sucessfully Done.....");
				return "user";
		}else{
			model.put("errorMsg", "Invalid username or password");
			return "login";
		}
	}
	
	@GetMapping("forpass")
	public String Forgotpassword() {
		return "Fpassword";
	}
	
	@PostMapping("change")
	public ModelAndView changePass(PasswordReset password) {
	System.out.println("change"+password.getUsername());
	User details=userservice.findByname(password.getUsername());
	ModelAndView mv=new ModelAndView();
	if(details!=null) {
	details.setPassword(password.getNewpassword());
	userservice.saveUser(details);
	mv.addObject("msg","Password Updated Successfully");
	mv.setViewName("home");
	return mv;
	}
	else {
	mv.addObject("msg","User Not Found");
	mv.setViewName("Fpassword");
	return mv;
	}
	}
	
	@GetMapping("fill1")
	public String fillDetails(HttpSession s) {
		User id=(User) s.getAttribute("id");

		if(id==null) {
			return "errorpage";
		}
			return "Mainpage";
	}
	
	@PostMapping("fill2")
	public String fillDetails2(@ModelAttribute ("m") ResumeDetails r,HttpSession s,Model m) {

	User id=(User) s.getAttribute("id");
    User u=userservice.getUserById(id.getSlno());
	r.setUser(u);
	String msg=resumedetailsservice.saveUser(r);
	if(msg==null)
	m.addAttribute("msg", true);

		return "user";
	}
	
	@GetMapping("/view")
	public String viewDetails(Model model, HttpSession s) {
		User id=(User) s.getAttribute("id");

		if(id==null) {
			return "errorpage";
		}
    ResumeDetails r2=resumedetailsservice.getbyId(id.getSlno());	
    model.addAttribute("model", r2);
    List<Jobs> jobs = jobsservice.getAllJobs();
      model.addAttribute("jobs", jobs);
    return "Viewpage";
	}
	
	@GetMapping("update")
	public ModelAndView update(@RequestParam("no") Integer slno) {
		System.out.println("slno "+slno);
	Optional<ResumeDetails> resumeDetails= resumedetailsservice.getbyIdd(slno);
	ResumeDetails details=resumeDetails.get();
	ModelAndView mv=new ModelAndView();
	mv.addObject("r",details);
	mv.setViewName("updatepage");
	return mv;
	}
	
	@PostMapping("updatepage")
	public ModelAndView main(ResumeDetails details) {
		ResumeDetails details2=resumedetailsservice.update(details);
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg",details.getFirstname()+" updated successfully");
		ResumeDetails r2=resumedetailsservice.findResume((User)httpsession.getAttribute("id"));
		mv.addObject("model", r2);
		List<Jobs> job = jobsservice.getAllJob();
		mv.addObject("jobs", job);
		mv.setViewName("Viewpage");
		return mv;
	}
	
	@GetMapping("/delete")
	public String deleteuserdetails(@RequestParam Integer no,ModelMap model) {
		System.out.println(no);
		if(no==null) {
			System.out.println("nono");
			model.put("del","there is nothing to delete");
			return "Viewpage";
		}
		else {
			resumedetailsservice.Deleteuser(no);
			return "user";
		}
	}
	
	@GetMapping("jobs")
	public String jobs() {
		return "jobs";
	}
	
	@PostMapping("addJobDetails")
	public String addjobs(@ModelAttribute("u") Jobs u) {
		jobsservice.saveJobs(u);
		return "jobs";
	}
	

	@GetMapping("loglout")
	public String logout(HttpSession s) {
		s.invalidate();
		return "home";
	}
	
	@GetMapping("back")
	public String back() {
		return "user";
	}
	
	@GetMapping("search")
	public String search1(@RequestParam String jobtitle,Model m) {
		System.out.println("----------"+jobtitle);
		System.out.println(jobsservice.getByTitle(jobtitle));
		System.out.println("----------");
		m.addAttribute("jobs", jobsservice.getByTitle(jobtitle));
		return "Search";
	}
	
	@GetMapping("back1")
	public String back1() {
		return "user";
	}
		@GetMapping("back3")
	public String back3() {
		return "user";
	}
}