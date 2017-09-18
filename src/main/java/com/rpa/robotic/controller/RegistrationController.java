package com.rpa.robotic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rpa.robotic.entity.Registration;
import com.rpa.robotic.service.RegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationService rs;

	@RequestMapping("/")
	public String GoHome(Model model) {
		model.addAttribute("name", "karthikeyan");
		return "index";
	}

	@RequestMapping("/save")
	public String SaveRegi(Registration r, Model model) {
		Registration rData = rs.SaveRegi(r);
		System.out.println(rData.getId());
		model.addAttribute("refid", rData.getId());
		return "success";
	}

}
