package testcases;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
public class basetestcases {
	static public WebDriver driver;
	public Properties p;

	@BeforeClass (groups={"regression","unitTesting","sanity"})
	@Parameters({"os","browser"})
	public void setup(@Optional ("windows")String os,@Optional("chrome") String br) throws InterruptedException, IOException {
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
@AfterClass (groups={"regression","unitTesting","sanity"})
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
	public String captureScreen(String tname) throws IOException {
	    String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	    TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	    File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	    String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
	    File targetFile = new File(targetFilePath);
	    sourceFile.renameTo(targetFile);
	    return targetFilePath;
	}
}


