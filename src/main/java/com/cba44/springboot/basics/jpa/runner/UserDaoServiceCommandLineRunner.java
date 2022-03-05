package com.cba44.springboot.basics.jpa.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cba44.springboot.basics.jpa.entity.User;
import com.cba44.springboot.basics.jpa.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private UserDAOService userDAOService;
	
	private static final Logger logger = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Admin");
		userDAOService.insert(user);
		logger.info("New User is Created " + user);
	}

}
