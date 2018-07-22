package com.example.login.services;

import java.util.ArrayList;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.login.model.User;
import com.example.login.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	private final UserRepository userRepository;	
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public void saveMyUser(User user)
		{
			userRepository.save(user);
		}
	
	public List<User> showAllUsers(){
		
		List<User> users=new ArrayList<User>();
		for(User user:userRepository.findAll()) {
			users.add(user);
			}
		return users;
	}
	
	public void deleteMyUser(int id) {
		userRepository.deleteById(id);
	}
	
	public User editMyUser(int id) {
		//return userRepository.findOne(id);
		User user1 = null;
		for(User user:userRepository.findAll()) {
			if(user.getId()==id)
			{
				user1=user;
				break;
			}
		
		}
		return user1;

	}
	
	
	public User findByEmailAndPassword(String email,String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}
	/*public List<String> showSpecificUsers(String email) {
		return userRepository.getAllEmail(email);
	}*/
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}
