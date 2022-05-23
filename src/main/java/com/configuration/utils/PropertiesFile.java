package com.configuration.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public String getValue(String filePath,String key) throws FileNotFoundException {
		String baseDir=System.getProperty("user.dir");
		String value="";
		FileInputStream fis=new FileInputStream(baseDir+filePath);
		Properties prop=new Properties();
		try {
			prop.load(fis);
			value=prop.getProperty(key);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return value;
	}

}
