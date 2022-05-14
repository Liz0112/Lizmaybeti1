package com.liz;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class portada {
	@GetMapping("/demo/")
	 public String Index()
	 {
		 return "portada";
	 }
}