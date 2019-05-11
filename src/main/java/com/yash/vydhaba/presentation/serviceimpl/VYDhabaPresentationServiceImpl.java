package com.yash.vydhaba.presentation.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yash.vydhaba.bussiness.service.VYDhabaBusService;
import com.yash.vydhaba.presentation.model.UserDetail;
import com.yash.vydhaba.presentation.service.VYDhabaPresentationService;

@Component
public class VYDhabaPresentationServiceImpl implements VYDhabaPresentationService {

	@Autowired
	private VYDhabaBusService vyDhabaBusService;
	
	@Override
	public List<UserDetail> getAllUser() {
		return vyDhabaBusService.getAllUser();
	}

}
