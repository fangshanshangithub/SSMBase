package com.family.tree.controller.json;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/json")
public class JsonController {
	private static Logger logger =  LoggerFactory.getLogger(JsonController.class);
	
	@RequestMapping(value="/test", method=RequestMethod.POST,  produces = "application/json" )
	public String toIndex(@RequestParam String jsonValue){
		logger.info("*********StudentController 开始执行了！！！！******jsonValue=" + jsonValue);
		 
		System.out.println(jsonValue);
		
		logger.info("*********StudentController 结束了！！！！******");
		return "";
	}
}
