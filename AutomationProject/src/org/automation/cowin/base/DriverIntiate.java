package org.automation.cowin.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverIntiate {
	public static WebDriver driver;

	@BeforeClass
	public static void browserLaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/vikram/cowin/AutomationProject/driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.cowin.gov.in/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public void afterTest() throws Exception {
		driver.close();
	}

}
