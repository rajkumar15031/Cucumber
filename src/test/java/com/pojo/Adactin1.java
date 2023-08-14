package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base;

public class Adactin1 extends Base {
	public Adactin1()  {
		PageFactory.initElements(driver, this);
	}  
	@FindBy(id="username")
	private WebElement userName;
	@FindBy(id="password")
	private WebElement userPassword;
	@FindBy(id="login")
	private WebElement logIn ;

//done
	
	public WebElement getUserName() {
		return userName;
	}
	public  WebElement getUserPassword() {
		return userPassword;
	}
	public WebElement getLogIn() {
		return logIn;
	}
	public void login(String string,String string2) {
		send(getUserName(), string);
		send(getUserPassword(), string2);
		click(getLogIn());
		
	}

}
