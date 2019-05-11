package com.yash.vydhaba.bussiness.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.vydhaba.bussiness.service.VYDhabaBusService;
import com.yash.vydhaba.dao.UserRepo;
import com.yash.vydhaba.dao.entity.User;
import com.yash.vydhaba.presentation.model.UserDetail;

@Service
public class VYDhabaBusServiceImpl implements VYDhabaBusService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public List<UserDetail> getAllUser() {
	
		List<User> users = userRepo.findAll();
		
		List<UserDetail> userDetails = new ArrayList<UserDetail>();
		
		for (User user : users) {
			UserDetail userDetail = new UserDetail(user.getUserId(), user.getFirstName(), user.getLastName(), user.getPassword(), user.getEmailId(), user.getMobileNo());
			userDetails.add(userDetail);
		}
		
		return userDetails;
	}

}
