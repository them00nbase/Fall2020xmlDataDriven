package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.AddContact;
import page.HomePage;
import page.LoginPage;

import util.BrowserFactory;



public class AddContactTest {
@Test
@Parameters({"email","password","Name","Company","Email","Phone","Address","City","State","Zip"})
public void AddingContact(String email,String password,String Name,String Company,String Email,String Phone,String Address,String City,String State,String Zip) 
		
		throws InterruptedException {

	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");

	LoginPage logintotechfios= PageFactory.initElements(driver, LoginPage.class);

	logintotechfios.Login(email,password);

HomePage home= PageFactory.initElements(driver, HomePage.class);

home.NavigateToAddContact();

Thread.sleep(1000);

AddContact contact=PageFactory.initElements(driver, AddContact.class);

Thread.sleep(2000);

contact.FillingUpAdressForm(Name,Company,Email,Phone,Address,City,State,Zip);

AddContact.clickSubmitButton();

driver.close();

driver.quit();

}
}