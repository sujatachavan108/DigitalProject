package com.configuration.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Environment {
	String baseDir = System.getProperty("user.dir");

	public String getAppUrl() throws FileNotFoundException {

		FileInputStream fis = new FileInputStream(baseDir+ "/src/main/resources/environment.properties");

		String value = "";
		Properties prop = new Properties();
		try {
			prop.load(fis);
			value = prop.getProperty("app_url");
		} catch (IOException e) {

			e.printStackTrace();
		}

		return value;

	}

	public void getUserName() {
		Properties prop = new Properties();
		prop.getProperty("app_username");

	}
	public void getPassWord() {
		Properties prop = new Properties();
		prop.getProperty("app_password");

	}
	
	

	public static void main(String[] args) throws FileNotFoundException {
		new Environment().getAppUrl();
		new Environment().getUserName();
		new Environment().getPassWord();
	}

}
