package com.app.cal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.cal.model.service.CalculatorService;
import com.app.cal.model.service.ValidationService;


@Controller
@RequestMapping("main")
public class CalculatorController {
	private static final Logger logger = LoggerFactory.getLogger(CalculatorController.class);
	
	@Autowired
	CalculatorService calculatorService;
	
	@Autowired
	ValidationService validationService;
	
	private String previousResult;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String index() {
		logger.info("index page has been loaded.");
		return "index";
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public String calculate(@RequestParam String expression,Model model){
		System.out.println(expression);
		
		boolean validationResult = validationService.validation(expression);
		// class 
		if(validationResult) {
			calculatorService.calculation(expression);
			model.addAttribute("previousResult", previousResult);
			model.addAttribute("error","");
		} else {
			previousResult = expression;
			model.addAttribute("expression",expression);
			model.addAttribute("error","X");
		}
		
		return "index";
	}
}
