package com.uday.springboot.firstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("hello")
	public String sayHello(@RequestParam String name,ModelMap model) {
		model.put("name",name);
		return "sayHello";
	}
	
	@RequestMapping("hellohtml")
	@ResponseBody
	public String sayHellohtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><head><title>Hello</title></head>");
		sb.append("<body><h1>How are You</h1></body></html>");
		return sb.toString();
	}
}
