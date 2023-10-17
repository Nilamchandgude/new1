 package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
	
	//@FindBy(xpath="//a[@class='login']")             
	//private WebElement loginbutton ;
	
	//@FindBy(xpath="//input[@type='text']")             
	//private WebElement emailid ;
	    
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password ;
	
	@FindBy(xpath="//button[@id='btnLogin']")             
	private WebElement continuebutton ;
	
	//@FindBy(xpath="//button[@class='back-btn']")             
	//private WebElement goback ;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	
	//public void login_click() {
		//loginbutton.click();
	//}
	public void enter_emailid(String email) {//Parameterized method created
		emailid.sendKeys(email);
	}
	public void enter_password(String Pass) {
		password.sendKeys(Pass);
	}
	public void click_continue() {
		continuebutton.click();
	}
	//public void click_goback() {
	//	goback.click();
		
	//}

}

