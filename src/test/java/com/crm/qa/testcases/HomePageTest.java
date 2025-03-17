package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	public HomePageTest() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void setUp() throws IOException {
		initalization();
		loginpage=new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifylogeduserdetails() throws IOException {
		 homepage = new HomePage();
		homepage.checkUserdetails();
		homepage.clickTimeSheet();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	

}
