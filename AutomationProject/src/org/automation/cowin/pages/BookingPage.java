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
		String select_State = inputRepository.getString("selectState_xpath");
		String select_State1 = inputRepository.getString("selectState_xpath1");
		driver.findElement(By.xpath(select_State)).click();
		driver.findElement(By.id(select_State1)).click();
	}

	public void selectDistrict() {
		String select_District = inputRepository.getString("selectDistrict_xpath");
		String select_District1 = inputRepository.getString("selectDistrict_xpath1");
		driver.findElement(By.xpath(select_District)).click();
		driver.findElement(By.id(select_District1)).click();
	}

	public void searchButton() {
		String search_Button = inputRepository.getString("searchButton_xpath");
		driver.findElement(By.xpath(search_Button)).click();
	}

	public void getcount() {
		String get_count = inputRepository.getString("getcount_xpath");
		String ste = driver.findElement(By.xpath(get_count)).getText();
		System.out.println(ste);
	}

	public void searchingBooking() throws InterruptedException {
		Thread.sleep(5000);
		searchByDistrict();
		Util.ScrollDown();
		selectState();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		selectDistrict();
		searchButton();
	}
}
