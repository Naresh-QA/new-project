package testcases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class basetestcases {
	public WebDriver driver;
	@BeforeClass
	public void setup() throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.goldbharat.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
}
@AfterClass
public void tearup() {
	driver.quit();
}
public String randomString() {
	String generatedString=RandomStringUtils.randomAlphabetic(8);
	return generatedString;
}
public String randomnumber() {
	String generatednumber=RandomStringUtils.randomNumeric(10);
		return generatednumber;
}
	public String randomnumbers() {
		String generatednumbers=RandomStringUtils.randomNumeric(8);
		return generatednumbers;
	}
	public String alphanumeric() {
		String generatedalphanumeric=RandomStringUtils.randomAlphanumeric(9);
		return generatedalphanumeric;
	}
}


