package com.hop.pop.controllers.rest;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hop.pop.MyPojo;

@Controller
public class SimpleRestController {
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/json", method = RequestMethod.GET)
	public @ResponseBody MyPojo getAsJson(Locale locale, Model model) {
		MyPojo a = new MyPojo();
		
		a.setValue("Just a value");
		
		return a;
	}
}
