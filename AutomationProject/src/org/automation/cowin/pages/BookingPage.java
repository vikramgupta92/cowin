package org.automation.cowin.pages;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.automation.cowin.base.DriverIntiate;
import org.automation.cowin.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingPage extends DriverIntiate {

	ResourceBundle inputRepository = ResourceBundle.getBundle("object_repository_cowin");

	public BookingPage(WebDriver driver) {
		DriverIntiate.driver = driver;
	}

	public void searchByDistrict() {
		String searchBy_District = inputRepository.getString("searchByDistrict_xpath");
		driver.findElement(By.id(searchBy_District)).click();
	}

	public void selectState() {
		String select_State1 = inputRepository.getString("selectState_xpath1");
		driver.findElement(By.id(select_State1)).click();
	}
	
	public void selectStateDropDown() {
		String select_State = inputRepository.getString("selectState_xpath");
		driver.findElement(By.xpath(select_State)).click();
	}

	public void selectDistrict() {
		String select_District1 = inputRepository.getString("selectDistrict_xpath1");
		driver.findElement(By.id(select_District1)).click();
	}
	public void selectDistrictDropDown() {
		String select_District = inputRepository.getString("selectDistrict_xpath");
		driver.findElement(By.xpath(select_District)).click();
	}
	
	public void searchButton() {
		String search_Button = inputRepository.getString("searchButton_xpath");
		driver.findElement(By.xpath(search_Button)).click();
	}

	public void searchingBooking() throws InterruptedException {
		searchByDistrict();
		Util.scrollDown();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		selectStateDropDown();
		selectState();
		Thread.sleep(1000);
		selectDistrictDropDown();
		selectDistrict();
		searchButton();
	}
}
