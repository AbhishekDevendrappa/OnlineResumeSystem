package com.ors.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ors.model.Recuiter;
import com.ors.model.User;
import com.ors.service.MailSenderService;
import com.ors.service.RecuiterService;
import com.ors.service.userService;

@Controller
public class LoginAndRegisterController {
	
	@Autowired
	userService userservice;
	
	@Autowired
	HttpSession httpsession;
	
	@Autowired
	MailSenderService mailSenderService;
	
	@Autowired
	RecuiterService recuiterService;
	
	@GetMapping
	public String home()
	{
		return "home";
	}
	
	@GetMapping("register")
	public String showregister()
	{
		return "UserRegister";
	}
	
	@GetMapping("alogin")
	public String show_admin_login()
	{
		return "AdminLogin";
	}
	
	@GetMapping("ulogin")
	public String show_user_login()
	{
		return "Userlogin";
	}
	
	@GetMapping("rlogin")
	public String show_recuiter_login() {
		return "RecuiterLogin";
	}
	
	@GetMapping("forpass")
	public String Forgotpassword() {
		return "Fpassword";
	}
	
	@GetMapping("gohome")
	public String  gohome() {
		return "home";
	}
	
	@GetMapping("afterregister")
	public String afterregister() {
		return "Userlogin";
	}
	
	@GetMapping("requietrregister")
	public String recuiterregister() {
		return "RecuiterRegister";
	}
	
	@PostMapping("adminlogin")
	public String Admin_Login(ModelMap model, @RequestParam String Adminname, @RequestParam String Password) {
		if(Adminname.equals("admin") && Password.equals("123"))
		{		
			mailSenderService.sendEmaillogin("abhisd2000@gmail.com", "Adminlogin to ORS", "Admin Login Sucessfully Done.....");
				return "Adminmain";
		}else{
			model.put("errorMsg", "Invalid username or password");
			return "AdminLogin";
		}
	}
	
	@PostMapping("add")
	public String register_user(@ModelAttribute("u") User u,ModelMap model) {
		userservice.saveUser(u);
		    mailSenderService.sendEmailregistration("abhisd2000@gmail.com", "Registration to ORS", "Registration Sucessfully Done.....",u.getUsername(),u.getPassword());
			model.put("registerMsg", "User registered successfully");
		return "Afterregister";
	}
	
	@PostMapping("addreciuter")
	public String register_recuiter(@ModelAttribute("r") Recuiter r,ModelMap model) {
		recuiterService.saveRecuiter(r);
		    mailSenderService.sendEmailregistration(r.getEmail(), "Registration to ORS", "Registration Sucessfully Done.....",r.getName(),r.getPassword());
			model.put("registerMsg", "User registered successfully");
		return "RecuiterLogin";
	}
	
	@PostMapping("/login")
	public String Mainpage(ModelMap model, @RequestParam String email, @RequestParam String Password,HttpSession s) {
		User user = userservice.getUser(email, Password);
		
		if(user==null) {	
			model.put("errorMsg", "Invalid username or password");
			return "login";
			
		}else{
			String a = user.getUsername();
			String uemail= user.getEmail();
			model.put("um", a);
			s.setAttribute("id", user);
			mailSenderService.sendEmaillogin(uemail, "login to ORS", "Login Sucessfully Done.....");
				return "user";
		}
	}
	
	@PostMapping("/recuiterlogin")
	public String Recuiter_Mainpage(ModelMap model, @RequestParam String email, @RequestParam String password,HttpSession s) {
		Recuiter u = recuiterService.getrecuiter(email, password);
		if(u!=null) {		
			String a = u.getName();
			String reemail = u.getEmail();
			model.put("um", a);
			s.setAttribute("id", u);
			mailSenderService.sendEmaillogin(reemail, "login to ORS", "Login Sucessfully Done.....");
				return "RecuiterMain";
		}else{
			model.put("errorMsg", "Invalid username or password");
			return "RecuiterLogin";
		}
	}
	


}
