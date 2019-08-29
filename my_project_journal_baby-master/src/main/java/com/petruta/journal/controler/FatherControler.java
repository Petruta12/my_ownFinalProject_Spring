package com.petruta.journal.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.petruta.journal.model.AboutFather;
import com.petruta.journal.services.JournalServices;

@Controller
public class FatherControler {

	@Autowired
	JournalServices journalServices;

	@Autowired
	public FatherControler(JournalServices services) {
		this.journalServices = services;
	}

	@RequestMapping("/")
	public String viewHomePage(Model model) {

		return "index";
	}

	@GetMapping("/about_father")
	public String viewFather(@ModelAttribute AboutFather mmmm, Model model) {
		
//	    List<AboutFather> listAboutFathers = journalServices.listAll();
//	    model.addAttribute("listAboutFathers", listAboutFathers);

		return "AboutMyFather";
	}
	
	
	

	@PostMapping("/contact_form")
	public String addFather(@ModelAttribute AboutFather aboutFather, Model model) {
		List<AboutFather> listAboutFathers = journalServices.listAll();
		model.addAttribute("listAboutFathers", listAboutFathers);
		System.out.println(aboutFather.getName());
		journalServices.save(aboutFather);

		return "redirect:dateFather";
	}

	@RequestMapping("/dateFather")
	public String dateParinte(Model model) {
		List<AboutFather> listAboutFathers = journalServices.listAll();
		model.addAttribute("listAboutFathers", listAboutFathers);

		return "dateFather";
	}

	@RequestMapping("/delete/{id}")
	public String deleteParinte(@PathVariable(name = "id") int id) {
		journalServices.delete(id);
		return "forward:/dateFather";
	}
	

	
	@RequestMapping("/edit/{id}" )
	public ModelAndView displayEdit(@PathVariable(name = "id") long id) {
		
	   
		ModelAndView mav = new ModelAndView("edit_journal");
		
	    AboutFather journal = journalServices.get(id);
	    System.out.println(journal);
	    mav.addObject("aboutFather", journal);
	     
	   return mav;
	}
	
	
	
}
	

