package com.ors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class MailSenderService{
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendEmailregistration(String toEmail, String subject, String body, String string, String string2){
		
		SimpleMailMessage message=new SimpleMailMessage (); 
		message.setFrom("abhisheksd1ga18ec004@gmail.com");
		message.setTo(toEmail); 
		message.setText (body+" Your User name is "+string+" and Password is "+string2);
		message.setSubject (subject);
		javaMailSender.send(message);
		System.out.println("Mail Sent successfully...");
	}
	
public void sendEmaillogin(String toEmail, String subject, String body){
		
		SimpleMailMessage message=new SimpleMailMessage (); 
		message.setFrom("abhisheksd1ga18ec004@gmail.com");
		message.setTo(toEmail); 
		message.setText (body);
		message.setSubject (subject);
		javaMailSender.send(message);
		System.out.println("Mail Sent successfully...");
	}

	

}
