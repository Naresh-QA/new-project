package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homepage extends base {

	public homepage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
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
	new WebDriverWait(driver, Duration.ofSeconds(10))
    .until(ExpectedConditions.elementToBeClickable(Click_login));
	Click_login.click();
	
}
}