package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class register extends base {
	
	public register(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@placeholder=' Ex: Retail Gold']")
	WebElement Business_name;
	@FindBy(xpath="//input[@placeholder=' Ex: Kumar']")
	WebElement full_name;
@FindBy(xpath="//input[@placeholder=' Ex: *********@gmail.com']")
WebElement mailid;
@FindBy(xpath="//input[@placeholder=' Ex: 891******4']")
WebElement mobile_number;
@FindBy(xpath="//input[@placeholder=' Ex: +91**********']")
WebElement date;
@FindBy(xpath="//input[@placeholder=' Ex: 5*****']")
WebElement pin_code;

@FindBy(xpath="//p[normalize-space()='Balajinagar']//input[@type='radio']")
WebElement space;
//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//WebElement address =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@class='input-filed ng-untouched ng-pristine ng-invalid']")));

@FindBy(xpath="//textarea[@class='input-filed ng-untouched ng-pristine ng-invalid']")
WebElement address;

@FindBy(xpath="//button[normalize-space()='Register']")
WebElement registers;

//action methods
public void setname(String businessname){
	Business_name.sendKeys(businessname);
}
public void setfullname(String fullname) {
	full_name.sendKeys(fullname);
}
public void setmailid(String Mailid) {
	mailid.sendKeys(Mailid);
}
public void setmobile_number(String Mobilenumber) {
	mobile_number.sendKeys(Mobilenumber);
}
public void setdate(String Date) {
	date.sendKeys(Date);
}
public void setpin_code(String pincode) {
	pin_code.sendKeys(pincode);
}
public void setspace() {
	space.click();
}
public void setaddress(String Address) {
	 new WebDriverWait(driver, Duration.ofSeconds(5))
     .until(ExpectedConditions.visibilityOf(address));
	address.sendKeys(Address);
}
public void setregister() {
	 new WebDriverWait(driver, Duration.ofSeconds(10))
     .until(ExpectedConditions.visibilityOf(registers));
	registers.click();
}
}                                                                       
