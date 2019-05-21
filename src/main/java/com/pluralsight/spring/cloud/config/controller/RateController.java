package com.pluralsight.spring.cloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {

	@Value("${rate}")
	public String rate;
	
	@Value("${lanecount}")
	public String laneCount;
	
	@Value("${tollstart}")
	public String tollStart;
	
	@RequestMapping("/rate")
	public String getRates(Model m) {
		
		m.addAttribute("rate", rate);
		m.addAttribute("lanecount", laneCount);
		m.addAttribute("tollstart", tollStart);
		
		return "rateview";
	}
}
