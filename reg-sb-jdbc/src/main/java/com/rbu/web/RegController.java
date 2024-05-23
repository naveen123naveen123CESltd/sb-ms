package com.rbu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.rbu.service.RegService;

@Controller
public class RegController {
	@Autowired
	RegService regService;
	@RequestMapping(value="/regform",method = RequestMethod.POST)
	public RedirectView register(Student student) {
		System.out.println(student);
		int id=regService.create(student);
		System.out.println(id);
		RedirectView r=new RedirectView("successmethod");
		return r;
	}
	
	@RequestMapping("successmethod")
	public ModelAndView redrectSuccessPage() {
		return new ModelAndView("success");
	}
	

}
