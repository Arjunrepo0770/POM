package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.crm.qa.utilities.PageUtils;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException {
	
		 prop = new Properties();
		FileInputStream ip = new FileInputStream("F:\\Practise\\PageObjectModel\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		prop.load(ip);
		
	}
	
	public static void initalization() {
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "F:/Practise/chromedriver-win64/chromedriver-win64/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable-notifications");
			 driver = new ChromeDriver(options);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(PageUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(PageUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	

	
	
}
