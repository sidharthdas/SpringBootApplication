package com.sid.service;

import java.util.List;
import java.util.Optional;


import com.sid.model.User;

public interface UserService {

	public User createUser(User u);
	public List<User> getUsers();
	public Optional<User> getUser(Integer id);
	public User updateUser(User u, Integer id);
	public void deleteUser(Integer id);

}
