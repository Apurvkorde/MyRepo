package jbkpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOperators {
	WebDriver driver;
	@FindBy(xpath = "//a[@href='operators.html']")
	public WebElement operators;
	@FindBy(xpath = "//td[text()=\"Urgent Technical Help\"]")
	public WebElement kiran;
	@FindBy(xpath = "//td[text()=\"Neelam\"]")
	public WebElement Neelam;
	@FindBy(xpath = "//td[text()=\"Seema\"]")
	public WebElement Seema;
	@FindBy(xpath = "//td[text()=\"Varsha\"]")
	public WebElement Varsha;
	@FindBy(xpath = "//td[text()=\"Darshit\"]")
	public WebElement Darshit;

	public LoginOperators(WebDriver driver) {
	    this.driver=driver;
	  PageFactory.initElements(driver,  this);  
	}

	public void checksoperators() {
		operators.click();
		kiran.click();
		Neelam.click();
		Seema.click();
		Varsha.click();
		Darshit.click();
	}

}
