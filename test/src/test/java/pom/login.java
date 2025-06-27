package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login extends base {

	public login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@placeholder=' Enter Your Number']")
	WebElement mobilenumber;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement login;
	//action method
	@FindBy(xpath="//h6[normalize-space()='Welcome back! Glad to see you, Again']")
	WebElement loginpage;
	public void setmobilenumber(String Mobilenumber) {
		mobilenumber.sendKeys(Mobilenumber);
	}
	public void setclick_login() {
		login.click();
		
	}

	public void cleardata() {
		mobilenumber.clear();
	}
	public boolean getloginpage() {
		try {
			return (loginpage.isDisplayed());
		}
		catch (Exception e) {
			return false;
		}
	}
	
}
