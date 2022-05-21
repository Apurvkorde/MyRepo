package jbkpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDownloads {
	WebDriver driver;
	@FindBy(xpath = "//a[@href='downloads.html']")
	public WebElement downloads;
	@FindBy(xpath = "//td[text()=\"Java Development Kit \"]")
	public WebElement Java ;
	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[3]")
	public WebElement Selenium;
	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[4]/td[3]")
	public WebElement  Server;
	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[3]")
	public WebElement Google;
	@FindBy(xpath = "/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[6]/td[3]")
	public WebElement Driver;
	@FindBy(xpath = "//td[text()=\"Mozilla Firefox\"]")
	public WebElement Mozilla;
	@FindBy(xpath = "//td[text()=\"Gecko Driver for Latest firefox\"]")
	public WebElement Gecko;

	public LoginDownloads(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
			
	}

	public void checkdownloads() {
		downloads.click();
		Java.click();
		Selenium.click();
		Server.click();
		Google.click();
		Driver.click();
		Mozilla.click();
		Gecko.click();
	}


}
