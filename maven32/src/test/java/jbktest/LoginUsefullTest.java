package jbktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jbkpack.LoginUsefull;

public class LoginUsefullTest {
	WebDriver driver;
	LoginUsefull Ll;

	@BeforeMethod
	public void openoperators() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	 	driver=new ChromeDriver();
	 	driver.get(" file:///C:/Users/Hp/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
	 	driver.manage().window().maximize();
	 	Ll=new LoginUsefull(driver);
		  
	}
	 @Test
	 public void verifyTitle() {
		  Ll.checksusefullinks();
		  Assert.assertEquals(driver.getTitle(),"JavaByKiran | Useful Links");
	 }
}
