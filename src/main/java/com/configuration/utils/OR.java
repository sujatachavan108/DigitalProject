package com.configuration.utils;

import java.io.FileNotFoundException;
import java.util.Properties;

public class OR {
	String filePath = "\\src\\main\\resources\\OR.properties";
	PropertiesFile prop = new PropertiesFile();

	public String loginButton() throws FileNotFoundException {

		return prop.getValue(filePath, "verifyLoginPage");

	}

	public String getUserNameLocator() throws FileNotFoundException {
		// PropertiesFile prop=new PropertiesFile();
		return prop.getValue(filePath, "verifyUsername");

	}

	public String getUserPassword() throws FileNotFoundException {
		//PropertiesFile prop=new PropertiesFile();
		return prop.getValue(filePath,"verifyPassword");
	}
	public String logInButton() throws FileNotFoundException {
		return prop.getValue(filePath, "logInPage");

	}

	public String getUserNameLocator1() throws FileNotFoundException {
		return prop.getValue(filePath, "verifyLoginPage");

	}

	public String getUserPassword1() throws FileNotFoundException {

		return prop.getValue(filePath, "getUserPassword");

	}

	public String getloginButton() throws FileNotFoundException {

		return prop.getValue(filePath, "getLoginButton");

	}

}
