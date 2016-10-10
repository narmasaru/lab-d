package co.grandcircus.movies.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.grandcircus.movies.rest.SunService;
import co.grandcircus.movies.rest.WeatherService;
@Controller
public class SunController {
private static final Logger logger = LoggerFactory.getLogger(SunController.class);
	
	@Autowired
	private SunService sunriseService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/sun")
	public String home(Locale locale, Model model) {
		// add the 'sunrise' variable to the JSP
		model.addAttribute("sun1", sunriseService.getCurrentSunRiseAtGrandCircus());
		
		logger.info("/sun -> sun.jsp");
		// select to use the sunRise.jsp view
		return "sun";
	}
	


}
