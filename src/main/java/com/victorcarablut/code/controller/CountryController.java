package com.victorcarablut.code.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victorcarablut.code.model.Country;
import com.victorcarablut.code.service.CountryService;

@CrossOrigin(origins = "${url.fe.cross.origin}")
@RestController
@RequestMapping("/api/countries")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/all")
	public List<Country> getAllCountries() {
		return countryService.findAllCountries();
	}

}
