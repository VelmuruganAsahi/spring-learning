package com.luv2code.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Student theStudent = new Student();
		model.addAttribute("student", theStudent);
		model.addAttribute("theCountryOptions",countryOptions);
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("Student name: "+theStudent.getFirstname()+" "+theStudent.getLastname());
		return "student-confirmation";
	}
	
}
