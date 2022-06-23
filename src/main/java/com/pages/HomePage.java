package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.config.digital.UIKeywords;

public class HomePage {
	UIKeywords keywords = new UIKeywords();

	@FindBy(css="button#login")
	public WebElement loginLnk;
	
	public HomePage() {
		UIKeywords keywords = new UIKeywords();
		PageFactory.initElements(keywords.driver, this);
	}
	
	public void loginLnk() {
		
		loginLnk.click();

	}
}
