package com.example.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity(name="users")
public class User {
	@Id
	private Integer id;
	@Column
	private String name;
	@Column
	private String email;
	
	
//	public User() {
//		
//	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	@Column(name="id")
//	private Integer id;
//	@Column(name="name")
//	private String name;
//	@Column(name="email")
//	private String email
	
	;
}
