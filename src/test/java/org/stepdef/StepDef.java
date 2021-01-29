package org.stepdef;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pojo.Adactin1;
import com.pojo.Adactin2;
import com.pojo.Adactin3;
import com.pojo.Adactin4;
import com.utility.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends Base{
	static Adactin1 a1;
	static Adactin2 a2;
	static Adactin3 a3;
	static Adactin4 a4;
	
	


@Given("user is on Adactin")
public void user_is_on_Adactin() {
	
	launchBrowser();	
launchUrl("https://adactinhotelapp.com/");
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
   
}


@When("user enter username and password click btn")
public void user_enter_username_and_password_click_btn(io.cucumber.datatable.DataTable dataTable) {
	a1=new Adactin1();
	List<List<String>> a = dataTable.asLists();
	List<String> list = a.get(0);
	String s1 = list.get(0);
	String s2 = list.get(1);
	send(a1.getUserName(), s1);
	send(a1.getUserPassword(), s2);
	a1.getLogIn().click();

}


@When("user should select LOCATION {string} ,HOTELS {string}, ROOMTYPE {string},NUMBER OF ROOMS {string},ADULTS PER ROOM {string},CHILDRENS PER ROOM {string} user should click search btn")
public void user_should_select_LOCATION_HOTELS_ROOMTYPE_NUMBER_OF_ROOMS_ADULTS_PER_ROOM_CHILDRENS_PER_ROOM_user_should_click_search_btn(String string, String string2, String string3, String string4, String string5, String string6) {
   a2=new Adactin2();
   a2.searchHotel(string, string2, string3, string4, string5, string6);
}

@When("user should click select,user should click continue")
public void user_should_click_select_user_should_click_continue() {
    a3=new Adactin3();
    a3.selectHotel();
    
}

@When("user should select first {string},last {string},add {string},card {string},cvv {string},cctype {string},expmonth {string},expyear  {string} , user should click book")
public void user_should_select_first_last_add_card_cvv_cctype_expmonth_expyear_user_should_click_book(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
   a4=new Adactin4();
   a4.bookAHotel(string, string2, string3, string4, string5, string6, string7, string8);
}

@Then("user should get the id in console")
public void user_should_get_the_id_in_console() throws InterruptedException {
	Thread.sleep(4000);
	WebElement findElement = driver.findElement(By.id("order_no"));
	
	gettext(findElement);
  
}




}
