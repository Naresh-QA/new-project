package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class otp_page extends base{

	public otp_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//h6[normalize-space()='OTP Verification']")
	WebElement logo;
	public boolean getlogo() {
		try {
			return (logo.isDisplayed());
		}
		catch (Exception e){
			return false;
		}
	}
}
