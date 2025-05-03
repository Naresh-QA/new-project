package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class base {
	WebDriver driver;
	public base (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
