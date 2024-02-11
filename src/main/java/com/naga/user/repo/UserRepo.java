package com.naga.user.repo;

import org.springframework.data.repository.CrudRepository;

import com.naga.user.model.User;

public interface UserRepo extends CrudRepository<User, String>{

}
