package com.liz;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class demoController {
	@GetMapping("/")
	public String portada() {
	return "portada";
	}
}