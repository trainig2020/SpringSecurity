package com.yaswanth.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yaswanth.dto.User;

@Repository
@Transactional
public class UserDao {
	
@Autowired
private SessionFactory sessionFactory;

    public List<User> findByUsername(String username) {
    	SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery("select * from User where username =:username");
    	query.addEntity(User.class);
    	query.setParameter("username", username);
    	System.out.println("hai");
    	List<User> user = query.list();
    	for (User user2 : user) {
			System.out.println(user2.getUsername());
		}
    	return user;
    	 
    }
}
