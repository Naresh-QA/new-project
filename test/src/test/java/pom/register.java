package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
@FindBy(xpath="//p[normalize-space()='Ameenabad']")
WebElement space;
@FindBy(xpath="//textarea[@class='input-filed ng-untouched ng-pristine ng-invalid']")
WebElement address;

@FindBy(xpath="//button[normalize-space()='Register']")
WebElement register;


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
	address.sendKeys(Address);
}
public void setregister() {
	register.click();
}
}
