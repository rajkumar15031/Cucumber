package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base;

public class Adactin3 extends Base{
	public Adactin3()  {
		PageFactory.initElements(driver, this);
	} 
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	@FindBy(id="continue")
	private WebElement Continue;
	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}
	public WebElement getContinue() {
		return Continue;
	}
	public void selectHotel() {
	click(getRadiobutton_0());
	click(getContinue());
	

	}

}
