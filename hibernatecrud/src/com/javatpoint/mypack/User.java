package com.javatpoint.mypack;

import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@Entity
@Table(name = "hibernatecrud")
public class User {  
private int id;  
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
private String name,password,email;  
    
  
}  