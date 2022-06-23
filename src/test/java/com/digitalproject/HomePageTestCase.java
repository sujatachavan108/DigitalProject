package com.digitalproject;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.config.digital.UIKeywords;
import com.configuration.BaseTestCase;
import com.configuration.utils.PropertiesFile;
import com.pages.HomePage;

public class HomePageTestCase extends BaseTestCase  {
	UIKeywords keywords = new UIKeywords();
	

	@Test
	public void m1() {
		PropertiesFile file=new PropertiesFile();
		HomePage home = PageFactory.initElements(keywords.driver, HomePage.class);
		home.loginLnk();
	}
}
