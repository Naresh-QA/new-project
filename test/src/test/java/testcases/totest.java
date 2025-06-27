package testcases;

import org.testng.annotations.Test;

import pom.homepage;

public class totest extends basetestcases {
	@Test (groups={"sanity","unitTesting"})
	public void tests() throws InterruptedException
	{
		System.out.println("next step is driver method");
		homepage hp=new homepage(driver);
		hp.login();
		Thread.sleep(5000);
	}

}
