package com.szczeprez.springboot.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.szczeprez.springboot.exceptions.CustomerExceptionType;
import com.szczeprez.springboot.model.User;
import com.szczeprez.springboot.repositories.UserRepository;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class); 
	
	@Override
	public User findById(Long id) {
		User findOne = userRepository.findOne(id);
		LOGGER.info("Retrive in method findById {} ", findOne);
		return findOne;
	}

	@Override
	public User findByName(String name){
		User nameResponse = userRepository.findByName(name);
		LOGGER.info("Retrive in method findByName {}", nameResponse);
		if(null == nameResponse){
			 try {
				throw new CustomerExceptionType("Error during retieving in method findByNma");
			} catch (CustomerExceptionType e) {
				e.getMessage(); 
			} 
		}
		return nameResponse;
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user); 
		LOGGER.info("User saved {}", user);
	}

	@Override
	public void updateUser(User user) {
		saveUser(user);
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.delete(id);
		LOGGER.info("User deleted " , id);
	}

	@Override
	public void deleteAllUsers() {
		userRepository.deleteAll();
		LOGGER.info("Deleted all users ");
	}

	@Override
	public List<User> findAllUsers() {
		List<User> users = userRepository.findAll();
		LOGGER.info("All users {} " , users);
		return users; 
	}

	@Override
	public boolean isUserExist(User user){
		if(findByName(user.getName()) != null){
		LOGGER.info("User exists");
		return true; 
		}
		LOGGER.info("User doesn't exist");
		return false;
	}

}
