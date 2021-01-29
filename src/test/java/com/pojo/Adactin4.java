package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base;

public class Adactin4 extends Base {
	public Adactin4()  {
		PageFactory.initElements(driver, this);
	} 
	@FindBy(id="first_name")
	private WebElement first_name;
	@FindBy(id="last_name")
	private WebElement last_name;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cc_num;
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	public WebElement getOrder_no() {
		return order_no;
	}
	@FindBy(id="cc_type")
	private WebElement cc_type;
	@FindBy(id="cc_exp_month")
	private WebElement cc_exp_month;
	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;
	@FindBy(id="book_now")
	private WebElement book_now;
	@FindBy(id="order_no")
	private WebElement order_no;
	
	
	public WebElement getFirst_name() {
		return first_name;
	}
	public WebElement getLast_name() {
		return last_name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCc_num() {
		return cc_num;
	}
	public WebElement getCc_cvv() {
		return cc_cvv;
	}
	public WebElement getCc_type() {
		return cc_type;
	}
	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}
	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}
	public WebElement getBook_now() {
		return book_now;
	}
	public void bookAHotel(String string,String string2,String string3,String string4,String string5,String string6,String string7,String string8) {
		send(getFirst_name(), string);
		send(getLast_name(), string2);
		send(getAddress(), string3);
		send(getCc_num(), string4);
		send(getCc_cvv(), string5);
		selectByVisibleText(getCc_type(), string6);
		selectByVisibleText(getCc_exp_month(), string7);
		selectByVisibleText(getCc_exp_year(), string8);
		click(getBook_now());
	}
	

}
