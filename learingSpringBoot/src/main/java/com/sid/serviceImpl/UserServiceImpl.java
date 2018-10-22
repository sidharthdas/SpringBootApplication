package com.sid.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.model.User;
import com.sid.repository.UserRepository;
import com.sid.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User u) {
		return userRepository.save(u);
	}

	@Override
	public List<User> getUsers() {
		
		
		return (List<User>)userRepository.findAll();
	}

	@Override
	public Optional<User> getUser(Integer id) {
		
		return userRepository.findById(id);
	}

	@Override
	public User updateUser(User u, Integer id) {
		
		return userRepository.save(u);
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
		

	}

}
