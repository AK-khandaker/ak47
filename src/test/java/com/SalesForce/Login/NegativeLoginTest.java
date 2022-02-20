package com.SalesForce.Login;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SalesForce.Base.BasePage;
import com.SalesForce.Pages.LoginPage;

public class NegativeLoginTest extends BasePage{
	public LoginPage lp= new LoginPage (getDriver());
	
	@BeforeMethod
	public void openApp() {
		getDriver();
	}
	
	@Test (priority=0)
	public void userNameBox() {
		lp.getUserName("Lucifer");
	}
	
	@Test (priority=1)
	public void passwordBox() {
		lp.getPassword("1234");
	}
	
	@Test (priority=2)
	public void signinButton() {
		lp.getLogin();
	}
	
	@AfterTest
	public void closeApp() {
		closeDriver();
	}
}
