package co.grandcircus.movies.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.grandcircus.movies.rest.HolidayService;
import co.grandcircus.movies.rest.WeatherService;
@Controller
public class HolidayController {
private static final Logger logger = LoggerFactory.getLogger(HolidayController.class);
	
	@Autowired
	private HolidayService holidayservice;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/holiday")
	public String home(Locale locale, Model model) {
		// add the 'weather' variable to the JSP
		model.addAttribute("holidayList", holidayservice.getCurrentHolidays());
	
		
		logger.info("/holiday -> holiday.jsp");
	//	logger.debug("holidayservice output ->" + holidayservice.getCurrentHolidays().toString());
		
		// select to use the weather.jsp view
		return "holiday";
	}
	


}
