package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("tiles")
public class TilesController {

	@RequestMapping(value="/content1" , method=RequestMethod.GET)
	public String content1() {
		return "tiles/content1"; // tiles definition의 name과 바인딩
	}
	
	@RequestMapping(value="/content2" , method=RequestMethod.GET)
	public String content2() {
		return "tiles/content2"; // tiles definition의 name과 바인딩
	}
	
	@RequestMapping(value="/content3" , method=RequestMethod.GET)
	public ModelAndView content3() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("tiles/content3"); // tiles definition의 name과 바인딩
		
		return mv; 
		//return new ModelAndView("tiles/content3");
	
	}
	
	
}
