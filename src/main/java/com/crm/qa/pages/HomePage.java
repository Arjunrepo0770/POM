package com.crm.qa.pages;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//*[@class='oxd-userdropdown-name']")
	WebElement loggedusername;
	
	@FindBy(xpath=" //*[@title=\"Timesheets\"][1]")
	WebElement timesheet;
	
	
	public HomePage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public String homePageTitle() {
		return driver.getTitle();
	}
	
	public String checkUserdetails() {
		String usernamedetails = loggedusername.getText();
		return usernamedetails;
	}
	
	public void clickTimeSheet() {
		timesheet.click();
	}
	
}
