package com.BrainsInJars.Stepdef;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BrainsInJars.pageobjectmodel.OrangeHRMPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OrangeHRM {
	
	
	WebDriver driver;
	@Given("^user visits OrangeHRM homepage$")
	public void user_visits_OrangeHRM_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tabas\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://www.orangehrm.com/contact-sales/");
		   Thread.sleep(3000);
		   driver.manage().window().maximize();
	}

	@When("^user click on Contact Sales and types \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_click_on_Contact_Sales_and_types(String arg1, String arg2, String arg3) throws Throwable {
		OrangeHRMPOM hrm=new OrangeHRMPOM (driver);
	Actions act = new Actions(driver);
	hrm.contactsale().click();
	hrm.Fullname().sendKeys(arg1);
	hrm.phonenumber().sendKeys(arg2);
	hrm.Businessemail().sendKeys(arg3);
	WebDriverWait wait = new WebDriverWait(driver,20);
	}
    @When("^User select Country and Number of Employees$")
	public void user_select_Country_and_Number_of_Employees() throws Throwable {
	    
    	OrangeHRMPOM hrm1=new OrangeHRMPOM(driver);
    	Select country=new Select (hrm1.Click_Country);
    	country.selectByVisibleText("Australia");
    	Select noof= new Select (hrm1.Click_Noofemployee);
    	noof.selectByVisibleText("0 - 10");
    	WebDriverWait wait= new WebDriverWait (driver,20);
	}

	@When("^User type\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_type(String arg1, String arg2) throws Throwable {
		OrangeHRMPOM hrm= new OrangeHRMPOM (driver);
		Actions act=new Actions (driver);
		hrm.jobtitle().sendKeys(arg1);
		hrm.yourmessage().sendKeys(arg2);
		WebDriverWait wait= new WebDriverWait (driver,20);
		
}
}
