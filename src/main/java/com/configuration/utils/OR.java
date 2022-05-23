package com.configuration.utils;

import java.util.Properties;

public class OR {
	String filePath="\\src\\main\\resources\\OR.properties";
	PropertiesFile prop=new PropertiesFile();

	public String  getUserNameLocator() {
		return prop.getValue(filePath,);
      
	}
}
