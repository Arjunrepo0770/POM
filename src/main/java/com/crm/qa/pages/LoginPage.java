package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//div[@class='orangehrm-login-forgot']//p")
	WebElement forgotpassword;
	
	

	
	public LoginPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	
	public String ValidatePageTitle() {
		return driver.getTitle();
	}
	

	
	public  void login(String un,String pas) {
		
		username.sendKeys(un);
		password.sendKeys(pas);
		loginbtn.click();
	 
	}
	
	
	
	
	

}
