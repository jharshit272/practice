package com.javatpoint;  
  
public class User {  
private int id;  
private String name;  
//getters and setters  
  
public String execute(){  
    RegisterDao.saveUser(this);  
    return "success";  
}

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
  
}