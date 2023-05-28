package com.BrainsInJars.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JCPenneyPOM {

WebDriver driver;	
	
	public JCPenneyPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"subMenuLevel1\"]/li[7]/div")
	WebElement Act_Babyandkids;
	public WebElement Babyanbdkids() {
		return Act_Babyandkids;
	}
	
	
	
}
