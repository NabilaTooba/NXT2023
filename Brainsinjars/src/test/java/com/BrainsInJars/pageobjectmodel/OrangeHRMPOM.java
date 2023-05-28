package com.BrainsInJars.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPOM {
	
	WebDriver driver;
	
	public OrangeHRMPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/a/button")
	 WebElement click_contactsale;
	public WebElement contactsale() {
		return click_contactsale;
	}
	
	@FindBy(name="FullName")
	WebElement Type_Fullname;
	public WebElement Fullname() {
		return Type_Fullname;
	}
	
	@FindBy(name="Contact")
	WebElement Type_Phonenumber;
	public WebElement phonenumber() {
		return Type_Phonenumber;
	}
	
	@FindBy(name="Email")
	WebElement Type_Businessemail;
	public WebElement Businessemail() {
		return Type_Businessemail;
	}
	
	@FindBy(name="Country")
	public WebElement Click_Country;
	
	
 @FindBy(xpath="//*[@id=\"Form_getForm_NoOfEmployees\"]")
	public WebElement Click_Noofemployee;
	
	
	@FindBy(id="Form_getForm_JobTitle")
	WebElement Type_jobtitle;
	public WebElement jobtitle() {
		return Type_jobtitle;
	}
	
	@FindBy(id="Form_getForm_Comment") 
	WebElement Type_yourmessage;
	public WebElement yourmessage() {
		return  Type_yourmessage;
	}
	
	
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

