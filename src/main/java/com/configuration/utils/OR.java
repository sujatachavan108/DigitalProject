package com.configuration.utils;

import java.io.FileNotFoundException;

public class OR {
	String filePath="\\src\\main\\resources\\OR.properties";
	PropertiesFile prop=new PropertiesFile();
	public String  loginButton() throws FileNotFoundException {
		
		return  prop.getValue(filePath,"verifyLoginPage");

	}
	

	public String  getUserNameLocator() throws FileNotFoundException {
		//PropertiesFile prop=new PropertiesFile();
		return prop.getValue(filePath,"verifyUsername");
      
	}
	public String getUserPassword() throws FileNotFoundException {
		//PropertiesFile prop=new PropertiesFile();
		return prop.getValue(filePath,"verifyPassword");

	} 
}
