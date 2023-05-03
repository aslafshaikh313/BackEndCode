package com.sppu.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sppu.main.model.AddmisonForm;
import com.sppu.main.service.AddmisionFormService;

@RestController
public class SppuController {

	@Autowired
	AddmisionFormService afs;
	
	@GetMapping("/getaddmision")
	public Iterable<AddmisonForm> getData() {
		return afs.getData();
	}
	
	@PostMapping("/saveaddmision")
	public AddmisonForm saveData(@RequestBody AddmisonForm a) {
		return afs.save(a) ;
	}
	
	
	@PutMapping("/upadteaddmision/{i}")
	public AddmisonForm updateaddmision(@RequestBody AddmisonForm a, @PathVariable int i) {
		
		return afs.updateData(a,i);
	}
	
	
	@DeleteMapping("/deleteaddmision/{i}")
	public String deleteData(@PathVariable int i) {
		
		return afs.deleteData(i);
	}
}
