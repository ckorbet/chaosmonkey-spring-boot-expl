package com.cartorgon.cmsb.rest;

import org.springframework.http.ResponseEntity;

import com.cartorgon.cmsb.model.MyDto;

public interface MyRestService {
	ResponseEntity<MyDto> getDto(String firstName, String lastName);
}
