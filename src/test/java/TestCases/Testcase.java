package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class Testcase {
		@Test
		public void Program(){
		
				WebDriver driver = new ChromeDriver();
				driver.get("http://adactinhotelapp.com/");
				LoginPage LP = PageFactory.initElements(driver, LoginPage.class);
		        LP.loginAction("vasuvespag","vasu1234");
		        
		}
	}

