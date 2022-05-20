package com.config.digital;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
	public static RemoteWebDriver driver = null;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid Browser");
		}
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void clickOn(String locator) {
		driver.findElement(By.cssSelector(locator)).click();/**
															 * if (locator.equalsIgnoreCase("Xpath")) {
															 * driver.findElement(By.xpath(locator)).click(); } else if
															 * (locator.equalsIgnoreCase("cssSelector")) {
															 * 
															 * } else { System.err.println("Invalid Locator Type"); }
															 */

	}

	public static void userName(String userName) {
		driver.findElement(By.cssSelector(userName)).sendKeys("N");
	}

	public static void passWord(String passWord) {
		driver.findElement(By.cssSelector(passWord)).sendKeys("a");
	}

	public static void clickLoginBtn(String loginButton) {
		driver.findElement(By.cssSelector(loginButton)).click();
	}

	public static void maxmizeWindow() {
		driver.manage().window().maximize();
	}

	public static void fillForm(String newApp) {
		driver.findElement(By.cssSelector(newApp)).click();
	}

	public static void applicantName(String applicantName) {
		driver.findElement(By.cssSelector(applicantName)).sendKeys("ABC");

	}

	public static void applicantMobNo(String mobNo) {
		driver.findElement(By.cssSelector(mobNo)).sendKeys("987654321");
	}

	public static void applicantEmailId(String emailId) {
		driver.findElement(By.cssSelector(emailId)).sendKeys("abc@gmail.com");

	}

	public static void applicantAdhaarNo(String adhaarNo) {
		driver.findElement(By.cssSelector(adhaarNo)).sendKeys("12345");// TODO Auto-generated method stub

	}

	public static void applicantAddress(String address) {
		driver.findElement(By.cssSelector(address)).sendKeys("yenikoni");

	}

	public static void scrollPage(String scrollPage) {
		driver.executeScript(scrollPage);

	}

	public static void checkBox(String checkBox) {
		driver.findElement(By.cssSelector(checkBox)).click();

	}

	public static void checkName(String checkName) {
		driver.findElement(By.cssSelector(checkName)).sendKeys("ABC");

	}

	public static void checkDate(String checkDate) {
		driver.findElement(By.cssSelector(checkDate)).sendKeys("15-08-1947");

	}

	public static void saveForm(String saveForm) {
		driver.findElement(By.cssSelector(saveForm)).click();

	}

	public static void okButton(String okBtn) {
		driver.findElement(By.cssSelector(okBtn)).click();
	}

}

/**
 * public static void getTitle(String title) {
 * 
 * driver.findElement(By.cssSelector(title));
 * 
 * }
 */
