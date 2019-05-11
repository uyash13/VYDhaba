package com.yash.vydhaba.bussiness.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yash.vydhaba.bussiness.model.UserPrincipal;
import com.yash.vydhaba.dao.UserRepo;
import com.yash.vydhaba.dao.entity.User;

@Service
public class MyUserDetailService implements UserDetailsService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepo.findByUserId(username);
		List<User> users = userRepo.findAll();
		if (user == null) {
			System.err.println("user not found");
			throw new UsernameNotFoundException("User Not found");
		}
		System.err.println("User found :" + user.getUserId() + "  :  "+ user.getPassword());
		return new UserPrincipal(user);
	}

}
