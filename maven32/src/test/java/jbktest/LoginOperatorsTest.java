package jbktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jbkpack.LoginOperators;

public class LoginOperatorsTest {
	WebDriver driver ;
	LoginOperators lo;

	@BeforeMethod
	public void openoperators() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	 	driver=new ChromeDriver();
	 	driver.get(" file:///C:/Users/Hp/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
	 	driver.manage().window().maximize();
	 	lo=new LoginOperators(driver);
		  
	}
	 @Test
	 public void verifyTitle() {
		  lo.checksoperators();
		  Assert.assertEquals(driver.getTitle(),"JavaByKiran | Operators");
	 }
}
