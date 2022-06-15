package com.digitalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.config.digital.UIKeywords;
import com.configuration.BaseTestCase;

public class DigitalProjectTestCases extends BaseTestCase {
	public RemoteWebDriver driver = null;
	/*
	@Test(priority = -21)
	public static void launchBrowser() {
		UIKeywords.openBrowser("chrome");
	    //UIKeywords.launchUrl("http://gpyenikoni.g-seva.com/login");
		
	}*/

	@Test(priority = -20)
	public static void verifyLoginPage() {
		UIKeywords.clickOn("button#login");
		// driver.findElement(By.cssSelector("button#login")).click();
	}

	@Test(priority = -19)
	public static void verifyUsername() throws InterruptedException {
		Thread.sleep(5000);
		UIKeywords.userName("input#login");
		// driver.findElement(By.cssSelector("input#login")).sendKeys("N");

	}

	@Test(priority = -18)
	public static void verifyPassword() throws InterruptedException {
		Thread.sleep(3000);
		UIKeywords.passWord("input#password");
		// driver.findElement(By.cssSelector("input#password")).sendKeys("a");

	}

	@Test(priority = -17)
	public void verifyLoginButton() throws InterruptedException {
		Thread.sleep(2000);
		UIKeywords.clickLoginBtn("input.fourth");
		// driver.findElement(By.cssSelector("input.fourth")).click();
	}

	@Test(priority = -16)
	public static void windowMaximizes() {
		UIKeywords.maxmizeWindow();
	}

	@Test(priority = -14)
	public static void verifyFillingForm() {
		UIKeywords.fillForm("li#newApplicationNavigation");
		// driver.findElement(By.cssSelector("li#newApplicationNavigation")).click();
	}

	@Test(priority = -13)
	public static void verifyApplicationInformation() {
		UIKeywords.applicantName("input#formName");
		// driver.findElement(By.cssSelector("input#formName")).sendKeys("ABC");
	}

	@Test(priority = -12)
	public static void verifyMobileNumber() {
		UIKeywords.applicantMobNo("input#formMobile");
		// driver.findElement(By.cssSelector("input#formMobile")).sendKeys("987654321");
	}

	@Test(priority = -11)
	public static void verifyEmailId() {
		UIKeywords.applicantEmailId("input#formEmail");
		// driver.findElement(By.cssSelector("input#formEmail")).sendKeys("abc@gmail.com");
	}

	@Test(priority = -10)
	public static void verifyAdhaarNumber() {
		UIKeywords.applicantAdhaarNo("input#formAadhar");
		// driver.findElement(By.cssSelector("input#formAadhar")).sendKeys("12345");
	}

	@Test(priority = -9)
	public static void verifyAddress() {
		UIKeywords.applicantAddress("textarea#formAddress");
		// driver.findElement(By.cssSelector("textarea#formAddress")).sendKeys("yenikoni");
	}

	@Test(priority = -7)
	public static void scrollPage() {
		UIKeywords.scrollPage("window.scrollBy(0,10000)");
		// driver.executeScript("window.scrollBy(0,10000)");
	}

	@Test(priority = -6)
	public static void verifyBirthCheckBox() {
		UIKeywords.checkBox("input#dakhlaCheckOne");
		// driver.findElement(By.cssSelector("input#dakhlaCheckOne")).click();
	}

	@Test(priority = -5)
	public static void verifyCheckName() {
		UIKeywords.checkName("input#dakhlaCheckOneName");
		// driver.findElement(By.cssSelector("input#dakhlaCheckOneName")).sendKeys("ABC");
	}

	@Test(priority = -4)
	public static void verifyCheckDate() {
		UIKeywords.checkDate("input#dakhlaCheckOneDate");
		// driver.findElement(By.cssSelector("input#dakhlaCheckOneDate")).sendKeys("15-08-1947");
	}

	@Test(priority = -3)
	public static void verifySaveForm() {
		UIKeywords.saveForm("button#saveNewUserForm");
		// driver.findElement(By.cssSelector("button#saveNewUserForm")).click();
	}

	@Test(priority = -2)
	public void verifyOkButton() throws InterruptedException {
		Thread.sleep(3000);
		UIKeywords.okButton("button.swal2-confirm.swal2-styled");
		driver.close();
	}
}

/**
 * 
 * @Test public void scrollPage() {
 *       driver.executeScript("window.scrollBy(1000,0)"); }
 * @Test public void villageLogin() {
 *       driver.findElement(By.cssSelector("li#loginNavigation")).click(); }
 * @Test (priority=-6) public void titleOfPage() { WebElement element
 *       =driver.findElement(By.cssSelector("p.p-2")); String title=
 *       element.getText(); System.out.println(title); }
 *
 * 
 * 
 * 
 * 
 * 
 * @Test(priority = -15) public void titleOfPage() {
 * 
 *                UIKeywords.getTitle("\"p.p-2\"");
 * 
 *                }
 * 
 * 
 * 
 *
 * 
 * 
 * @Test(priority = -11) public void verifyAdhaarNumber() {
 *                driver.findElement(By.cssSelector("input#formAadhar")).sendKeys("12345");
 *                }
 * 
 * @Test(priority = -10) public void verifyAddress() {
 *                driver.findElement(By.cssSelector("textarea#formAddress")).sendKeys("yenikoni");
 *                }
 * 
 * @Test(priority = -9) public void scrollPage() {
 *                driver.executeScript("window.scrollBy(0,10000)"); }
 * 
 * @Test(priority = -8) public void verifyBirthCheckBox() {
 *                driver.findElement(By.cssSelector("input#dakhlaCheckOne")).click();
 *                }
 * 
 * @Test(priority = -7) public void verifyCheckName() {
 *                driver.findElement(By.cssSelector("input#dakhlaCheckOneName")).sendKeys("ABC");
 *                }
 * 
 * @Test(priority = -6) public void verifyCheckDate() {
 *                driver.findElement(By.cssSelector("input#dakhlaCheckOneDate")).sendKeys("15-08-1947");
 *                }
 * 
 * @Test(priority = -5) public void verifySaveForm() {
 *                driver.findElement(By.cssSelector("button#saveNewUserForm")).click();
 *                }}
 */
/**
 * @Test(priority = -4) public void verifyOkButton() throws InterruptedException
 *                {
 *                driver.findElement(By.cssSelector("button.swal2-confirm")).click();
 *                //Alert al=driver.switchTo().alert();
 *                System.out.println(driver.getTitle()); Thread.sleep(2000);
 *                //al.accept(); }
 */

/********
 * Using Depends On Method*********
 * 
 * @Test(dependsOnMethods = "verifyUsername") public void verifyPassword()
 *                        throws InterruptedException { Thread.sleep(3000);
 *                        driver.findElement(By.cssSelector("input#password")).sendKeys("a");
 * 
 *                        }
 * 
 * @Test(dependsOnMethods = "verifyPassword") public void verifyLoginButton()
 *                        throws InterruptedException { Thread.sleep(2000);
 *                        driver.findElement(By.cssSelector("input.fourth")).click();
 *                        }
 * 
 * @Test(dependsOnMethods = "verifyLoginButton") public void verifyFillingForm()
 *                        {
 *                        driver.findElement(By.cssSelector("li#newApplicationNavigation")).click();
 *                        }
 * 
 * @Test(dependsOnMethods = "verifyFillingForm") public void
 *                        verifyApplicationInformation() {
 *                        driver.findElement(By.cssSelector("input#formName")).sendKeys("ABC");
 *                        }
 * 
 * @Test(dependsOnMethods = "verifyApplicationInformation") public void
 *                        verifyMobileNumber() {
 *                        driver.findElement(By.cssSelector("input#formMobile")).sendKeys("987654321");
 *                        }
 * 
 * @Test(dependsOnMethods = "verifyMobileNumber") public void verifyEmailId() {
 *                        driver.findElement(By.cssSelector("input#formEmail")).sendKeys("abc@gmail.com");
 *                        }
 * 
 * @Test(dependsOnMethods = "verifyEmailId") public void verifyAdhaarNumber() {
 *                        driver.findElement(By.cssSelector("input#formAadhar")).sendKeys("12345");
 *                        }
 * 
 * @Test(dependsOnMethods = "verifyAdhaarNumber") public void verifyAddress() {
 *                        driver.findElement(By.cssSelector("textarea#formAddress")).sendKeys("yenikoni");
 *                        }
 * 
 * @Test(dependsOnMethods = "verifyAddress") public void scrollPage() {
 *                        driver.executeScript("window.scrollBy(0,10000)"); }
 * 
 * @Test(dependsOnMethods = "scrollPage") public void verifyBirthCheckBox() {
 *                        driver.findElement(By.cssSelector("input#dakhlaCheckOne")).click();
 *                        }
 * 
 * @Test(dependsOnMethods = "verifyBirthCheckBox") public void verifyCheckName()
 *                        {
 *                        driver.findElement(By.cssSelector("input#dakhlaCheckOneName")).sendKeys("ABC");
 *                        }
 * 
 * @Test(dependsOnMethods = "verifyCheckName") public void verifyCheckDate() {
 *                        driver.findElement(By.cssSelector("input#dakhlaCheckOneDate")).sendKeys("15-08-1947");
 *                        }
 * 
 * @Test(dependsOnMethods = "verifyCheckDate") public void verifySaveForm() {
 *                        driver.findElement(By.cssSelector("button#saveNewUserForm")).click();
 *                        }
 * 
 *
 * 
 */
