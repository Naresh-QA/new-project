package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.homepage;
import pom.otp_page;
import utilities.DataProviders;

public class login_withddt extends basetestcases {
	@Test (dataProvider="LoginData",dataProviderClass=DataProviders.class, groups="dataDriven")
	 void loginddt(String mobile_number, String result) {
	try {
		homepage hp=new homepage(driver);
		hp.login();
		//login page
		pom.login log=new pom.login(driver);
		log.setmobilenumber(mobile_number);
		log.setclick_login();
		//otp page
		otp_page otp=new otp_page(driver);
		boolean otplogo=otp.getlogo();
		//Assert.assertEquals(otplogo, true);	
		if(result.equalsIgnoreCase("pass")) {
			if(otplogo==true) {
				Assert.assertTrue(true);
				driver.navigate().back();
				Thread.sleep(5000);
			}
			else{
				Assert.assertFalse(false, "OTP logo not found as expected for valid number");
				//driver.navigate().refresh();
				//log.cleardata();
				driver.navigate().back();
				Thread.sleep(3000);
			}
		}
		if(result.equalsIgnoreCase("fail")) {
			if(otplogo==true) {
				Assert.fail("OTP logo found for invalid number: " + mobile_number);
				driver.navigate().back();
				Thread.sleep(5000);
			}
			else{
				Assert.assertTrue(true, "OTP logo not found as expected for invalid number");
				//driver.navigate().refresh();
				driver.navigate().back();
				//log.cleardata();
				Thread.sleep(3000);
			}
	}
	
	}catch(Exception e) {
		Assert.fail();
	}
	}
}
