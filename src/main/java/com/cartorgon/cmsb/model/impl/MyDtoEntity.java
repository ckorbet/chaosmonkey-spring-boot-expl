package com.cartorgon.cmsb.model.impl;

import com.cartorgon.cmsb.model.MyDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class MyDtoEntity implements MyDto {	
	private String firstName;
	private String lastName;
}