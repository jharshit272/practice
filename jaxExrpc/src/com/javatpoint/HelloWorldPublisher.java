package com.javatpoint;  
import javax.xml.ws.Endpoint;  

//Endpoint publisher  
public class HelloWorldPublisher{  
	public static void main(String[] args) {  
		Endpoint.publish("http://localhost:7776/ws/hello", new HelloWorldImpl());
		Endpoint.
	}  
}  