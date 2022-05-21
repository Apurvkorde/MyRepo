package jbktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jbkpack.LoginPage;

public class Logintest {
	 WebDriver driver;
	  LoginPage lp;
	  
	  @BeforeMethod
	  public void opendahboard() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  	driver=new ChromeDriver();
	  	driver.get("file:///C:/Users/Hp/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	  	driver.manage().window().maximize();
	  	lp=new LoginPage(driver);
		  
	}
	  @Test
	  public void verifyTitle() {
		  lp.correctCredentials();;
		  Assert.assertEquals(driver.getTitle(),"JavaByKiran | Dashboard");
	  }
	  
	  
	  
}
