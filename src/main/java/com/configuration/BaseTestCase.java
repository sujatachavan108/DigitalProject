package com.configuration;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.config.digital.UIKeywords;
import com.configuration.utils.Environment;
import com.configuration.utils.OR;

public class BaseTestCase {
	
	private void syso() {
		System.out.println("No one can accesss this method");

	}
	public static Environment env = new Environment();
	public static OR objectRepo = new OR();

	@BeforeMethod
	public void openBrowser() throws FileNotFoundException  {
		UIKeywords.openBrowser("Chrome");
		//UIKeywords.maximizeWindow();
		UIKeywords.launchUrl(env.getAppUrl());
	}

	@AfterMethod
	public void closeBrowser() {
     UIKeywords.closeBrowser();

	}

}
