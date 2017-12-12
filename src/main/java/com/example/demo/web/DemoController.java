package com.example.demo.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	// inject via application.properties
		@Value("${welcome.message}")
		private String message = "Hello World";

		@RequestMapping("/demo")
		public String welcome(Map<String, Object> model) {
			model.put("message", this.message);
			return "demo";
		}


}
