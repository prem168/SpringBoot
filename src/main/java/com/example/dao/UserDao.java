package com.example.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.User;

@Component
public class UserDao {
	
	private static List<User> users= new ArrayList<>();
	 
//	private static int usersCount=3;
//	static {
//		users.add(new User(1, "Prem", new Date()));
//		users.add(new User(2, "Prems", new Date()));
//		users.add(new User(3, "Premsa", new Date()));
//		users.add(new User(4, "Premsai", new Date()));
//		users.add(new User(5, "Premv", new Date()));
//		users.add(new User(6, "Premvar", new Date()));
//		
//	}
//	
//	public List<User> findAll(){
//		return users;
//	}
//	public User save(User u){
//		if(u.getId()==null) {
//			u.setId(++usersCount);
//		}
//		users.add(u);
//		return u;
//	}
	public User findone(Integer i) {
		for(User user:users) {
			if(user.getId()==i) {
				return user;
			}
		}
		return null;
	}
}
