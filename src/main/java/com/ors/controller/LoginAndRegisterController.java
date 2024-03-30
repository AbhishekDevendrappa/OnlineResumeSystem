package com.ors.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ors.model.User;
import com.ors.service.MailSenderService;
import com.ors.service.userService;

@Controller
public class LoginAndRegisterController {
	
	@Autowired
	userService userservice;
	
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
	
	@GetMapping("ulogin")
	public String show_user_login()
	{
		return "Userlogin";
	}
	
	@GetMapping("alogin")
	public String show_admin_login()
	{
		return "AdminLogin";
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
	
	@GetMapping("gohome")
	public String  gohome() {
		return "home";
	}

}
