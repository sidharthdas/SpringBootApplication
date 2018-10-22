package com.sid.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sid.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
