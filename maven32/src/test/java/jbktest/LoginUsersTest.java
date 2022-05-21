package jbktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jbkpack.LoginUsers;

public class LoginUsersTest {
	WebDriver driver;
	  LoginUsers ls;
	  
	  @BeforeMethod
	  public void opendahboard() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  	driver=new ChromeDriver();
	  	driver.get(" file:///C:/Users/Hp/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
	  	driver.manage().window().maximize();
	  	ls=new LoginUsers(driver);
		  
	}
	  
	  @Test
	  public void verifytitle() {
		  ls.Checkusers();
		  Assert.assertEquals(driver.getTitle(),"JavaByKiran | User");
	  }
}
