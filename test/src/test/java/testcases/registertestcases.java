package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.homepage;
import pom.login;

public class registertestcases extends basetestcases {
	@Test(groups={"unitTesting","regression"})
	void register() throws InterruptedException {
		homepage hp=new homepage(driver);
		hp.register();
		pom.register reg=new pom.register(driver);
		reg.setname(randomString());
		reg.setfullname(randomString());
		reg.setmailid(randomString()+"@gmail.com");
		reg.setmobile_number(randomnumber());
		reg.setdate("12121996");
		reg.setpin_code("508206");
		Thread.sleep(3000);
		reg.setspace();
		Thread.sleep(3000);
		reg.setaddress(alphanumeric());
		Thread.sleep(3000);
		reg.setregister();
		Thread.sleep(3000);
		login log=new login(driver);
		boolean reg_log=log.getloginpage();
		Assert.assertEquals(reg_log, true);
		
	}
	

}
