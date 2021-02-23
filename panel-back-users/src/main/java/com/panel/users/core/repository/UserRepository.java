package com.panel.users.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.panel.users.core.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User,String>{

}
