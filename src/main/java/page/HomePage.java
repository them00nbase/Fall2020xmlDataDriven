package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebDriver driver;


public HomePage(WebDriver ldriver){

		this.driver=ldriver;
	}	

@FindBy(how = How.XPATH, using = "//span[text() = 'CRM']")

WebElement CRM;

@FindBy(how = How.LINK_TEXT, using = "Add Contact")

WebElement AddContactButton;

	public void NavigateToAddContact() throws InterruptedException{
		
		Thread.sleep(2000);
		CRM.click();
		Thread.sleep(5000);
		AddContactButton.click();
	}
}