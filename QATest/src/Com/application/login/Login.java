package Com.application.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Com.Element.Locators.*;

public class Login {

	private static WebElement element = null;


	
	  

	public static WebElement txtbx_UserName(WebDriver driver) {
		element = driver.findElement(By.xpath(Locator.Username));

        return element;
		// TODO Auto-generated method stub
	
	}
	public static WebElement txtbx_Password(WebDriver driver) {
		 element = driver.findElement(By.xpath((Locator.Password)));
		    
            return element;
		// TODO Auto-generated method stub
		
	}

	public static WebElement btn_LogIn(WebDriver driver) {
		// TODO Auto-generated method stub
		  element = driver.findElement(By.xpath(Locator.Login_submit));
		    
            return element;
	}
	
}
