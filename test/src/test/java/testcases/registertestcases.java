package testcases;

import org.testng.annotations.Test;

import pom.homepage;

public class registertestcases extends basetestcases {
	@Test
	void register() {
		homepage hp=new homepage(driver);
		hp.register();
		pom.register reg=new pom.register(driver);
		reg.setname(randomString());
		reg.setfullname(randomString());
		reg.setmailid(randomString()+"@gmail.com");
		reg.setmobile_number(randomnumber());
		reg.setdate("12121996");
		reg.setpin_code("508206");
		reg.setspace();
		reg.setaddress(alphanumeric());
		reg.setregister();
		
	}
	

}
