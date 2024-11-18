package com.bits.pilani.userservice.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.bits.pilani.userservice.entity.UserEntity;

public interface UserDao extends ListCrudRepository<UserEntity, Integer> {
	UserEntity findByUsername(String username);
}
