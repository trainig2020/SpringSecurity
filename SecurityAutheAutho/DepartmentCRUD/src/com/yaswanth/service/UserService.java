 package com.yaswanth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yaswanth.dao.UserDao;
import com.yaswanth.dto.MyUserDetails;
import com.yaswanth.dto.User;



@Service
public class UserService implements UserDetailsService {
    
	@Autowired
	UserDao userDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		List<User> user = userDao.findByUsername(username);
		User user1 = new User();
		for (User user2 : user) {
			user1.setId(user2.getId());
			user1.setPassword(user2.getPassword());
			user1.setActive(user2.getActive());
			user1.setRoles(user2.getRoles());
			user1.setUsername(user2.getUsername());
		}
		System.out.println("two"+user.get(0).getUsername());
		if(user==null){
			throw new RuntimeException();
		}
		else{
			return new MyUserDetails(user1);
		}	
		}
}
