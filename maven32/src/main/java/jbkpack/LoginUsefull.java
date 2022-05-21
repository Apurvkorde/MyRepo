package jbkpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUsefull {
	WebDriver driver;
	@FindBy(xpath = "//a[@href='links.html']")
	public WebElement usefulllinks;
	@FindBy(xpath = "//td[text()=\"Schedule\"]")
	public WebElement Schedule;
	@FindBy(xpath = "//td[text()=\"Video Lactures All Topics\"]")
	public WebElement video;
	@FindBy(xpath = "//td[text()=\"Selenium Interview Questions\"]")
	public WebElement Selenium;
	@FindBy(xpath = "//td[text()=\"Java Interview Questions\"]")
	public WebElement Java;
	@FindBy(xpath = "//td[text()=\"Courses\"]")
	public WebElement Courses;
	@FindBy(xpath = "//td[text()=\"Placement\"]")
	public WebElement Placement;

	public LoginUsefull(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void checksusefullinks() {
		usefulllinks.click();
		video.click();
		Schedule.click();
		Java.click();
		Courses.click();
		
		
	}
}
