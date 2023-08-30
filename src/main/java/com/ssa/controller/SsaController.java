package com.ssa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ssa.service.SsaService;

@RestController
public class SsaController {

	@Autowired
	private SsaService ssaService;
	
	@GetMapping("/state/{ssn}")
	public ResponseEntity<String> giveState(@PathVariable("ssn") Long ssn){
		String state = ssaService.giveState(ssn);
		
		return new ResponseEntity<>(state, HttpStatus.OK);
		
	}
}
