package com.config.digital;

import org.openqa.selenium.By;
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

	public static void click(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
		/**
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

}
