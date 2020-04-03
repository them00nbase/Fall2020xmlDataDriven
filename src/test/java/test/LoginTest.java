package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
@Test
public void TechfiosLoginTest(){
	
WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");	
	
LoginPage logintotechfios= PageFactory.initElements(driver, LoginPage.class);

logintotechfios.Login("techfiosdemo@gmail.com", "abc123");

driver.close();

driver.quit();

}
 

}

//You're accessing a certain function from the LoginPage thats why you need to declare the class name and created an object 
//non static to static
//with the help of pagefactory is actually allowing you to access any function from login page. 
//He's using initElements to help which class to got to