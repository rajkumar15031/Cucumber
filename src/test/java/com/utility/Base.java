package com.utility;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;


	public void launchBrowser() {
		if (driver==null) {
			
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 System.out.println(driver);
		 System.out.println("Date");
	}
		}

	public void launchUrl(String url) {
		driver.get(url);
		implicityWait();
	}

	public void send(WebElement element, String val) {
		if (isEnabled(element) && (isHidden(element) == true)) {
			element.sendKeys(val);
		}
	}

	public void click(WebElement element) {
		if (isEnabled(element) && (isHidden(element))) {
			element.click();
		}
	}

	public boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}

	public boolean isHidden(WebElement element) {
		return element.isDisplayed();
	}

	public void implicityWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void selectByVisibleText(WebElement element, String val) {
		new Select(element).selectByVisibleText(val);
	}

	public void gettext(WebElement element) {
		String s = element.getAttribute("value");
		System.out.println("order id  " + s);

	}
}
