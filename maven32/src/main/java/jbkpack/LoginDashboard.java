package jbkpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDashboard {
	 WebDriver driver;
	    @FindBy(xpath="//a[@href=\"../pdf/selenium-testing-syllabus-jbk.pdf\"]")
	    public WebElement Selenium;
	    @FindBy(xpath="//a[@href=\"../pdf/java-j2ee-syllabus-jbk.pdf\"]")
	    public WebElement Java ;
	    @FindBy(xpath="//a[@href=\"../pdf/python-syllabus.pdf\"]")
	    public WebElement Python;
	    @FindBy(xpath="//a[@href='users.html']")
	    public WebElement Users;

	    public LoginDashboard(WebDriver driver) {
	    	this.driver=driver;
	    	PageFactory.initElements(driver,this);
	    }
		public void checkdahboard() {
			 Selenium.click();
			 Java.click();
			 Python.click();
			 Users.click();
		}



}
