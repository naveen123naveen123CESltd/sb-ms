package com.rbu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RegController {
	/*
	 * @RequestMapping(value="/regform",method = RequestMethod.POST) public
	 * RedirectView register(HttpServletRequest req) { String
	 * name=req.getParameter("name"); String email=req.getParameter("email"); String
	 * address=req.getParameter("address"); System.out.println(name);
	 * System.out.println(email); System.out.println(address); RedirectView r=new
	 * RedirectView("successmethod"); return r; }
	 */
	
	
	/*
	 * @RequestMapping(value="/regform",method = RequestMethod.POST) public
	 * RedirectView register(@RequestParam("name") String
	 * name, @RequestParam("email") String email,
	 * 
	 * @RequestParam("address") String address) { System.out.println(name);
	 * System.out.println(email); System.out.println(address); RedirectView r=new
	 * RedirectView("successmethod"); return r; }
	 */
	@RequestMapping(value="/regform",method = RequestMethod.POST)
	public RedirectView register(Student student) {
		System.out.println(student);
	
		RedirectView r=new RedirectView("successmethod");
		return r;
	}
	
	@RequestMapping("successmethod")
	public ModelAndView redrectSuccessPage() {
		return new ModelAndView("success");
	}
	

}
