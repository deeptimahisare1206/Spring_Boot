package com.mypackage.dao;

import org.springframework.data.repository.CrudRepository;

import com.mypackage.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
}
