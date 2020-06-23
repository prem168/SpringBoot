package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.model.User;


@Service
public interface UserService extends JpaRepository<User, Integer>{
	
	
	public List<User> findAll();
	
	public Optional<User> findById(@Param("id") Integer id);
	@Modifying
	@Query(
			  value = 
			    "insert into Users (id,name,email) values (:id,:name,:email)",
			  nativeQuery = true)
			void insertUser(@Param("id") Integer id, @Param("name") String name, 
			  @Param("email") String email);
	

}
