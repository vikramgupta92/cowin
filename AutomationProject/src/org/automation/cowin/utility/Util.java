package org.automation.cowin.utility;

import java.util.ResourceBundle;

import org.automation.cowin.base.DriverIntiate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;

public class Util extends DriverIntiate {

	ResourceBundle inputRepository = ResourceBundle.getBundle("object_repository_cowin");

	public static void ScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
	}

	
	
	public void ValidateType(SoftAssert assertion ) {
		
		String Actual_result = inputRepository.getString("Actual_result_xpath");

		String ActualResult = driver.findElement(By.xpath(Actual_result)).getText();
		System.out.println(ActualResult);

		String Expected_result = inputRepository.getString("Expected_result_xpath");

		boolean isSame = ActualResult.equals(Expected_result);
		if (isSame) {
			System.out.print("\n");

			System.out.println("Actaul Result is as per the Expected Result ");
		} else {
			System.out.println("Actaul Result is not as per the Expected Result ");
		}
		assertion.assertTrue(ActualResult.equals(Expected_result), "Sorry, There is some error.. Actaul Result is not as per the Expected Result");
	}
}
