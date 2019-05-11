package com.yash.vydhaba.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.vydhaba.dao.entity.User;

public interface UserRepo extends JpaRepository<User, String> {

	User findByUserId(String userId);
	
	
}
