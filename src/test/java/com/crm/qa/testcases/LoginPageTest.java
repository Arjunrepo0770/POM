package com.crm.qa.testcases;



import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginpage;
	
	public LoginPageTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		initalization();
		loginpage = new LoginPage();
	}
		
	@Test
	public void loginPageTitleTest() {
		String title =loginpage.ValidatePageTitle();
		Assert.assertEquals(title, "OrangeHRM");
		
	}
			
	@Test
	public void loginTest() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown()  {
		driver.quit();
	}
	
	
	
	

}
