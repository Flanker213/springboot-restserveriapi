package com.amine.springbootrestserverapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amine.springboot.rest.server.entities.User;

public class UserRepository extends JpaRepository<User, Long> {
	
	User findByLogin(String login);

}
