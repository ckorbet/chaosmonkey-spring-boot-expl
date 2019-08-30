package com.cartorgon.cmsb.rest.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cartorgon.cmsb.model.MyDto;
import com.cartorgon.cmsb.rest.MyRestService;
import com.cartorgon.cmsb.service.MyDtoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class MyRestServiceImpl implements MyRestService {
	
	@Autowired
	private MyDtoService myDtoService;

	@GetMapping(path = "/getdto")
	@Override
	public ResponseEntity<MyDto> getDto(
			@Valid @RequestParam(value = "firstName", required = true) String firstName, 
			@Valid @RequestParam(value = "lastName", required = true) String lastName) {
		log.info("Received REST request to 'getDto'...");		
		log.info("Serving REST response");
		return new ResponseEntity<>(this.myDtoService.getDto(firstName, lastName), HttpStatus.OK);
	}
}