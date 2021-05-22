package org.automation.cowin.assertion;

import org.automation.cowin.base.DriverIntiate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Assertion extends DriverIntiate {
WebDriver Driver;
	
	//Assertion for Validation Element on Page	
	public static boolean ValidateElementExist(WebDriver driver,String xpath ){
		
		boolean result=false;
		
		try{
			 driver.findElement(By.xpath(xpath));
			result = true;
		   }
		catch(Exception e){
			
		}
		
		return 	result;
}


}