package com.stepdefination;

import com.config.digital.UIKeywords;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class First {
	UIKeywords keywords = new UIKeywords();

	@Given("Browser is launched url is opened")
	public void launchBrowser() {
		keywords.openBrowser("Chrome");
		keywords.launchUrl("http://gpyenikoni.g-seva.com/login");
	}

	@When("user name is given")
	public void userName() {
		keywords.userName("input#login");
	}

	@And("password is given")
	public void passWord() {
		keywords.passWord("input#password");
	}

	@Then("user must be login")
	public void msgPrint() {
		System.out.println("Successfully printed login");

	}

}
