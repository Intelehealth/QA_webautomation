package Com.application.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Com.Element.Locators.Locator;
import Com.Excel.utility.Xls_Reader;
import Com.SignInModule.LoginAction;
import ComConstant.util.*;

public class DataDrivenTest {
	public static WebDriver driver;
	
	
	Xls_Reader Reader = new Xls_Reader(Constant.Path_TestData + Constant.File_TestData);
	int rowCount = Reader.getRowCount("LoginCredentials");
	
	
@BeforeSuite
public void setup() {
			
			System.setProperty(Constant.Chrome_Property,Constant.Set_Property);
			
			driver = new ChromeDriver(); 
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
			
			driver.get(Constant.URL);
			
			driver.manage().window().maximize();
		}
		
@Test (priority=1)
public void VerifyLogin() throws InterruptedException {
	
	      String UserName = Reader.getCellData("LoginCredentials", "UserName", rowCount);

	      String Password = Reader.getCellData("LoginCredentials", "Password", rowCount);
	 
	      LoginAction.Execute(driver, UserName, Password);
	      
	      boolean HomeDisplay = driver.findElement(By.xpath(Locator.HomeDisplay)).isDisplayed();
	      System.out.println(HomeDisplay);
	      Assert.assertEquals(HomeDisplay, true);
}

@Test(priority=2)
public void HomeScreenUrlVerify() {
	
		String ActualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(Locator.ExpectedUrl, ActualUrl);
}

@Test(expectedExceptions = StaleElementReferenceException.class,priority=3) 
		
		 public void VisitNoteCreation() throws InterruptedException {
		
		//Xls_Reader Reader = new Xls_Reader(Constant.Path_TestData + Constant.File_TestData);
		//int rowCount = Reader.getRowCount("LoginCredentials");
		    System.out.println(rowCount);
		
			for(int rowNum=2; rowNum<=rowCount; rowNum++) {
			 
			 String PatientID = Reader.getCellData("VisitNoteCreation", "OpenMRSid", rowCount);
			 
			 String TypeDiagnosis = Reader.getCellData("VisitNoteCreation", "TypeDiagnosis", rowCount);
			 
			 String DiagnosisName = Reader.getCellData("VisitNoteCreation", "DiagnosisFullName", rowCount);
			 
			 String MedictionName = Reader.getCellData("VisitNoteCreation", "TypeMedication", rowCount);
			 
			 String Strength = Reader.getCellData("VisitNoteCreation", "Strength", rowCount);
			  
			 String Units_mg = Reader.getCellData("VisitNoteCreation", "Units_mg", rowCount);
			 
			 String Amount = Reader.getCellData("VisitNoteCreation", "Amount", rowCount);
			 
			 String Units_tab = Reader.getCellData("VisitNoteCreation", "Units_tab", rowCount);
			 
			 String Frequency = Reader.getCellData("VisitNoteCreation", "Frequency", rowCount);
			 
			 String Duration = Reader.getCellData("VisitNoteCreation", "Duration", rowCount);
			 
			 String Units_days = Reader.getCellData("VisitNoteCreation", "Units_days", rowCount);
			 
			 String Prescribed_Test = Reader.getCellData("VisitNoteCreation", "Prescribed_Test", rowCount);
			 
			 String Prescribed_TestName = Reader.getCellData("VisitNoteCreation", "Prescribed_TestName", rowCount);
			 
			 String SelectYear = Reader.getCellData("VisitNoteCreation", "SelectYear", rowCount);
			 
			 String SelectMonth = Reader.getCellData("VisitNoteCreation", "SelectMonth", rowCount);
			 
			 String SelectDay = Reader.getCellData("VisitNoteCreation", "SelectDay", rowCount);
			 
			 
				
				//float YearValue = Float.parseFloat(Year);
				//int SelectYear = Math.round(YearValue);
				
				//float DayValue = Float.parseFloat(Day);
				//int SelectDay = Math.round(DayValue);
				
			 
			
			 VisitNoteCreation.getData(PatientID,TypeDiagnosis,DiagnosisName,MedictionName,Strength
					 ,Units_mg,Amount,Units_tab,Frequency,Duration,Units_days,Prescribed_Test,Prescribed_TestName,SelectYear,SelectMonth,SelectDay);
		
		}
			
		}
	

@Test(priority=4)
public void VerfiyLogout() throws InterruptedException {
	
	WebElement Logout = driver.findElement(By.id(Locator.Logout));
	Logout.click();
	Thread.sleep(3000);
	String ActualUrlAfterLogout = driver.getCurrentUrl();
	Assert.assertEquals(Locator.ExpectedUrlAfterLogout, ActualUrlAfterLogout);
		
}
@AfterSuite
		public void EndofScript() {
	
		driver.quit();
	
	}

}
	
//*[@id="followup-button"]/p/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button/span/svg
//*[@id="followup-button"]/p/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button/span/svg

///html/body/div[2]/div[2]/div/mat-datepicker-content/mat-calendar
