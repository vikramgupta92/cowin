package org.automation.cowin.testcases;

import org.automation.cowin.base.DriverIntiate;
import org.automation.cowin.pages.BookingPage;
import org.automation.cowin.utility.Util;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class TC_001VerifyVaccinationBooking extends DriverIntiate {
	SoftAssert Assertion = new SoftAssert();
	Util tbutil = new Util();

	public void test() throws InterruptedException {
		try {
			BookingPage bb = new BookingPage(driver);
			bb.searchingBooking();
			tbutil.ValidateType(Assertion);
			Assertion.assertAll();
		}

		catch (Exception e) {
			// TODO: handle exception
			// Print Expection
			e.printStackTrace();
			System.out.println("There is some error ... ");
			throw e;
		}

	}
}
