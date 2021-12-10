package com.spring.util.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("tiles/boardEx(정답예시)")
public class BoardController_정답예시 {

	@RequestMapping(value = "/boardList" , method = RequestMethod.GET)		
	public String boardList() {
		return "board/boardList";	
	}
	
	@RequestMapping(value = "/boardWrite" , method = RequestMethod.GET)		
	public String boardWrite() {
		return "board/boardWrite";
	}
	
	@RequestMapping(value = "/boardUpdate" , method = RequestMethod.GET)		
	public ModelAndView boardUpdate() {
		return new ModelAndView("board/boardUpdate");
	}
	
	@RequestMapping(value = "/boardDelete" , method = RequestMethod.GET)		
	public ModelAndView boardDelete() {
		return new ModelAndView("board/boardDelete");
	}
	
}
