package com.cba44.springboot.basics.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cba44.springboot.basics.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
