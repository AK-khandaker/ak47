package com.SalesForce.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    
    @FindBy (how=How.NAME,using="username")  private WebElement uName;
    public WebElement getUserName(String enterYourUserName) {  // "String enterYourUserName" - dynamic coding with parameter
    	uName.sendKeys(enterYourUserName);
		return uName;
    }
	
    @FindBy (how=How.XPATH,using="//input[starts-with(@id,'password')]")  private WebElement password;
    public WebElement getPassword(String enterYourPassword) {  // "String enterYourUserName" - dynamic coding with parameter
    	password.sendKeys(enterYourPassword);
		return password;
    }
    
    @FindBy (how=How.XPATH,using="//input[starts-with(@id,'Login')]")  private WebElement logIn;
    public WebElement getLogin() {  // "String enterYourUserName" - dynamic coding with parameter
    	logIn.click();
		return logIn;
    }
    

}
