package com.javatpoint;  
import javax.jws.WebMethod;  
import javax.jws.WebService;  
import javax.jws.soap.SOAPBinding;  
import javax.jws.soap.SOAPBinding.Style;

//Service Endpoint Interface  

@WebService  
@SOAPBinding(style = Style.DOCUMENT)  
public interface HelloWorld{  
	 static int num =10;
	@WebMethod String getHelloWorldAsString(String name);
	@WebMethod String getHelloWorldAsString1(String name);  
}  