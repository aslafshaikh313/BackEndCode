package com.sppu.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SppuController {

	
	@GetMapping("/addmision")
	public String getData() {
		return "Addmisoin are open at any time";
	}
}
