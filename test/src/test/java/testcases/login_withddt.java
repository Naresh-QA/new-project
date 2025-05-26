package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.homepage;
import pom.otp_page;
import utilities.DataProviders;

public class login_withddt extends basetestcases {
	@Test (dataProvider="LoginData",dataProviderClass=DataProviders.class)
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

			}
			else{
				Assert.assertFalse(false);
			}
		}
		if(result.equalsIgnoreCase("fail")) {
			if(otplogo==true) {
				Assert.assertTrue(false);
				driver.navigate().back();

			}
			else{
				Assert.assertFalse(true);
			}
		
	}
	
	}catch(Exception e) {
		Assert.fail();
	}
	}
}
