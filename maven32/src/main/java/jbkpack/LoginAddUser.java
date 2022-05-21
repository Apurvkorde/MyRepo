package jbkpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAddUser {
	WebDriver driver;
	  @FindBy(xpath="//a[@href='users.html']")
	  public WebElement Users;
	  @FindBy(xpath = "//button[@class=\"btn btn-block btn-primary btn-sm pull-right\"]")
	  public WebElement button;
	  @FindBy(xpath = "//input[@class=\"form-control\"]")
	  public WebElement username;
	  @FindBy(xpath = "//input[@id=\"mobile\"]")
	  public WebElement Mobile;
	  @FindBy(xpath = "//*[@id=\"email\"]")
	  public WebElement email;
	  @FindBy(xpath = "//input[@id=\"course\"]")
	  public WebElement courses;
	  @FindBy(id = "Male")
	  public WebElement male;
	  @FindBy(xpath = "//*[text()=\"Maharashtra\"]")
	  public WebElement Select;
	  @FindBy(xpath = " //input[@type=\"password\"]")
	  public WebElement password;
	  @FindBy(xpath = "//input[@placeholder=\"FriendMobile\"]")
	  public WebElement Friends;
	  @FindBy(xpath = "//button[@type=\"submit\"]")
	  public WebElement Submit;
	  
	  
	  public LoginAddUser(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void checksadduser() {
		   Users.click();
		   button.click();
		   username.sendKeys("Apurv");
		   Mobile.sendKeys("9922472933");
		   email.sendKeys("askorde123@gmail.com");
		   courses.sendKeys("Java");
		   male.click();
		   Select.click();
		   password.sendKeys("12345");
		   
		   Friends.sendKeys("8055778342");
		   Submit.click();
		   driver.switchTo().alert().accept();
	  }
}
