package jbkpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUsers {
	WebDriver driver;
	@FindBy(xpath="//a[@href='users.html']")
	public WebElement Users;
	@FindBy(xpath="//td[text()=\"kiran@gmail.com\"]")
	public WebElement kiran;
	@FindBy(xpath="//td[text()=\"sagar@javabykiran.com\"]")
	public WebElement sagar;
	@FindBy(xpath = "//td[text()=\"monica@gmail.com\"]")
	public WebElement monica;
	@FindBy(xpath = "//td[text()=\"kimaya@gmail.com\"]")
	public WebElement kimaya;

	public LoginUsers(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,  this);
	}

	public void Checkusers() {
		Users.click();
		kiran.click();
		sagar.click();
		monica.click();
		kimaya.click();
	}

}
