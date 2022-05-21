package jbktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jbkpack.LoginDashboard;

public class LoginDashboardTest {
	WebDriver driver;
	  LoginDashboard ld;
	  
	  @BeforeMethod
	  public void opendahboard() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  	driver=new ChromeDriver();
	  	driver.get(" file:///C:/Users/Hp/Desktop/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
	  	driver.manage().window().maximize();
	  	ld=new LoginDashboard(driver);
		  
	}
	  @Test
	  public void verifyTitle() {
		  ld.checkdahboard();
		  Assert.assertEquals(driver.getTitle(),"JavaByKiran | User");
	  }
}
