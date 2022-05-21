package jbktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jbkpack.LoginDownloads;

public class LoginDownlaodTest {
	 WebDriver driver;
	  LoginDownloads ldd;
	  
	  @BeforeMethod
	  public void opendownloads() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  	driver=new ChromeDriver();
	  	driver.get(" file:///C:/Users/Hp/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
	  	driver.manage().window().maximize();
	  	ldd=new LoginDownloads(driver);
		  
	}
	  @Test
	  public void verifyTitle() {
		  ldd.checkdownloads();
		  Assert.assertEquals(driver.getTitle(),"JavaByKiran | Downloads");
	  }
	  
 
}
