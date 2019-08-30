package com.cartorgon.cmsb.service.impl;

import org.springframework.stereotype.Service;

import com.cartorgon.cmsb.model.MyDto;
import com.cartorgon.cmsb.model.impl.MyDtoEntity;
import com.cartorgon.cmsb.service.MyDtoService;

import io.micrometer.core.instrument.util.StringUtils;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MyDtoServiceImpl implements MyDtoService {
	@Override
	public MyDto getDto(final  String firstName, final  String lastName) {
		if(StringUtils.isBlank(firstName) || StringUtils.isBlank(lastName)) {
			throw new IllegalArgumentException("'firstName' and 'lastName' cannot be null or blank");
		}
		
		log.info(String.format("Building Dto with '%s' '%s'...", firstName, lastName));
		final long now = System.currentTimeMillis();
		final MyDto resDto = new MyDtoEntity(
				new StringBuilder(firstName).append(" ").append(now).toString(), 
				new StringBuilder(lastName).append(" ").append(now).toString());
		log.info(String.format("Returning [%s]", resDto));
		return resDto;
	}
}