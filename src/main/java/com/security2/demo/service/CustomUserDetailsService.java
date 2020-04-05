package com.security2.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security2.demo.model.User;
import com.security2.demo.repository.UserRepo;
@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User u=repo.findByUsername(username);
		CustomUserDetails det=null;
		
		if(u!=null) {
			det=new CustomUserDetails();
			det.setUser(u);
		}
		else 
		{
			throw new UsernameNotFoundException("User not exist with name************************************"+username);
		}
		return det;
	}

}
