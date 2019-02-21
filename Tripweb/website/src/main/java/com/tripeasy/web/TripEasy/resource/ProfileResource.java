
package com.tripeasy.web.TripEasy.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.tripeasy.web.TripEasy.entity.Profile;

/**
 * 
 * @author Shabzan
 *
 */
@Controller
/* @RequestMapping("/profile") */
public class ProfileResource {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/signin")
	public String logIn() {
		return "Login";
	}

	@RequestMapping("/signUpPage")
	public String signup() {
		return "SignUp";
	}

	/*
	 * @RequestMapping("/profile") public String profile() { return "Profile"; }
	 */
	 

	@RequestMapping("/signup")
	public String createProfile(@ModelAttribute Profile profile, Model model) {
		restTemplate.postForEntity("http://10.246.92.165:9090/profiles", profile, Profile.class);
		model.addAttribute("message", "success!");
		return "index";
	}

 
	@RequestMapping("/update")
	public String editProfile(@ModelAttribute Profile profile, Model model) {
		restTemplate.put("http://10.246.92.165:9090/profiles", profile);
		model.addAttribute("message", profile);
		return "profilePage";
	}
	@RequestMapping("/profiles")
	public String Profile(@ModelAttribute Profile profile, Model model) {
		restTemplate.put("http://10.246.92.165:9090/profiles", profile);
		model.addAttribute("message", profile);
		return "Profile";
	}
	
}
