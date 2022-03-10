package Com.SignInModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Com.application.login.Login;

public class LoginAction {

	public static WebElement Execute(WebDriver driver,String Username, String Password) throws InterruptedException{
		 
		
		
		Login.txtbx_UserName(driver).sendKeys(Username);
	     
	     
	     Login.txtbx_Password(driver).sendKeys(Password);
	 
	     Login.btn_LogIn(driver).submit();
	     Thread.sleep(10000);
	     
		return null;
			
			//System.out.println("Login Successful");
		
}

	
}
