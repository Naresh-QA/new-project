package testcases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
public class basetestcases {
	public WebDriver driver;
	public Properties p;

	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws InterruptedException, IOException {
		FileReader file=new FileReader("./src//test//resources//config.resources");
				p=new Properties();
				p.load(file);
		switch (br.toLowerCase()){
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver= new EdgeDriver(); break;
		case "firefox": driver=new FirefoxDriver();break;
		default :System.out.println("not a write browser");return;
		}
		//driver= new ChromeDriver();
		//driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(p.getProperty("appURL"));
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


