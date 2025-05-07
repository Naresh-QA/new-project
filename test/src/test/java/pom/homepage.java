package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends base {

	public homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Locators
	@FindBy(xpath="//button[normalize-space()='Register']")
	WebElement Click_register;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement Click_login;
	

//action Methods
public void register(){
	Click_register.click();
}
public void login() {
	Click_login.click();
	
}
}