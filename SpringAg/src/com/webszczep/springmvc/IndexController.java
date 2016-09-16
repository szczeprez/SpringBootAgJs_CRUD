package com.webszczep.springmvc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

	private static Log LOGGER = LogFactory.getLog(IndexController.class.getName()) ;
	
	@RequestMapping(method = RequestMethod.GET)
	public String getIndexPage() {
		LOGGER.info("logger !! in indexController");
		return "index";
	}
}
