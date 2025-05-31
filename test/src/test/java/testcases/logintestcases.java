package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.homepage;
import pom.otp_page;

public class logintestcases extends basetestcases{
	@Test(groups="sanity")
	void login() {
		homepage hp=new homepage(driver);
		hp.login();
		pom.login log=new pom.login(driver);
		log.setmobilenumber("7032753299");
		log.setclick_login();
		otp_page otp=new otp_page(driver);
		boolean otplogo=otp.getlogo();
		Assert.assertEquals(otplogo, true);
	}
}
