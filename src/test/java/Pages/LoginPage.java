package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import Pages.LoginPage;

public class LoginPage {
	WebDriver driver=new ChromeDriver();

	@FindBy(id="username")
	WebElement UName;
	
	@FindBy(id="password")
	WebElement Pword;
	
	@FindBy(id = "login")
	WebElement Log;
	

		public LoginPage(WebDriver driver) {
			super();
			this.driver=driver;
			}
		public void LoginTestCase(WebDriver driver) {
		    	this.driver=driver;
		    }
		public void loginAction(String username, String password){
		
		UName.sendKeys(username);
		
		Pword.sendKeys(password);
		
		Log.click();
			System.out.println("logged success");
		}

}


