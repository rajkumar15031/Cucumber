package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Base;

public class Adactin2 extends Base {
	public Adactin2()  {
		PageFactory.initElements(driver, this);
	} 
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement room_type;
	@FindBy(id="room_nos")
	private WebElement room_nos;
	@FindBy(id="adult_room")
	private WebElement adult_room;
	@FindBy(id="child_room")
	private WebElement child_room;
	@FindBy(id="Submit")
	private WebElement Submit;
	
	public WebElement getLoct1() {
		return location;
	}
	
	public WebElement getLocc() {
		return location;
	}
	
	public WebElement getLocat() {
		return location;
	}
	public WebElement getLocation() {
		return location;
	}
	
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getAdult_room() {
		return adult_room;
	}
	public WebElement getChild_room() {
		return child_room;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	public void searchHotel(String string,String string2,String string3,String string4,String string5,String string6) {
	selectByVisibleText(getLocation(), string);
	selectByVisibleText(getHotels(), string2);
	selectByVisibleText(getRoom_type(), string3);
	selectByVisibleText(getRoom_nos(), string4);
	selectByVisibleText(getAdult_room(), string5);
	selectByVisibleText(getChild_room(), string6);
	click(getSubmit());
		
	}
	

}
