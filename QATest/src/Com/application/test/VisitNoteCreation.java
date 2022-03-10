package Com.application.test;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import Com.Element.Locators.*;
import ComConstant.util.*;

public class VisitNoteCreation extends DataDrivenTest {


	public static boolean getData(String PatientID,String TypeDiagnosis, String DiagnosisName, 
			String MedictionName, String Strength, String Units_mg, String Amount, String Units_tab, String Frequency,String Duration, String Units_days, String Prescribed_Test, String Prescribed_TestName, String SelectYear, String SelectMonth, String SelectDay) throws InterruptedException {
		
		//float YearValue = Float.parseFloat(Year);
		//int SelectYear = Math.round(YearValue);
		
		//float DayValue = Float.parseFloat(Day);
		//int SelectDay = Math.round(DayValue);
		
        System.out.println(SelectYear);
        System.out.println(SelectDay);
   
		
		
		
		//WebElement Ele1 = driver.findElement(By.xpath(Locator.Username));
		//Ele1.sendKeys(Uname);
	
		//WebElement Ele2 = driver.findElement(By.xpath(Locator.Password));
		//Ele2.sendKeys(Pass);
		
		//WebElement Ele3 = driver.findElement(By.xpath(Locator.Login_submit));
		//Ele3.submit();
		//Thread.sleep(10000);
		
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath(Locator.PatientId));
		ele1.sendKeys(PatientID);
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.xpath(Locator.SearchPatient));
		ele2.submit();
		Thread.sleep(2000);
		
		WebElement ele3 = driver.findElement(By.xpath(Locator.ViewPatient));
		ele3.click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(Locator.ScrolldownTillLast);
		Thread.sleep(3000);
		
		WebElement ele4 = driver.findElement(By.id(Locator.StartVisit));
		if (ele4.isEnabled()) {
			ele4.click();
		}
		Thread.sleep(5000);
		
		WebElement element = driver.findElement
				(By.xpath(Locator.Patient_interaction));
		Actions actions = new Actions(driver);

		actions.moveToElement(element).click().perform();
		Thread.sleep(3000);
		
		WebElement ele5 = driver.findElement(By.xpath(Locator.Patient_interaction_Submit));
		ele5.click();
		Thread.sleep(3000);
	
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
		
			      
		
		WebElement ele6 = driver.findElement(By.xpath(Locator.Type_diagnosis));
		ele6.click();
		Thread.sleep(3000);
		ele6.sendKeys(TypeDiagnosis);
		//ele6.sendKeys("ma");
		Thread.sleep(3000);
		
		
		List<WebElement> list = driver.findElements(By.className(Locator.Diagnosis_Name));
	      for (WebElement listview : list) {
			if(listview.getText().equalsIgnoreCase(DiagnosisName)) {
			
	    	// if(listview.getText().equalsIgnoreCase("B53.8 Malaria, confirmed")) {
			 Actions actions1 = new Actions(driver);
			    actions1.moveToElement(listview);
			    Thread.sleep(2000);
				   listview.click();
				    Thread.sleep(3000);
		
	      
	    	    boolean result = false;
	    	    int attempts = 0;
	    	    while(attempts < 2) {
	    	        try {
	    	            WebElement radio1 = driver.findElement(By.xpath(Locator.Diagnosis_Radio1));
	    	            Actions actions2 = new Actions(driver);

	    	    		actions2.moveToElement(radio1).click().perform();
	    	    		Thread.sleep(3000);
	    	    		
	    	    		WebElement radio2 = driver.findElement(By.xpath(Locator.Diagnosis_Radio2));
		    	        Actions actions3 = new Actions(driver);

		    	    		actions3.moveToElement(radio2).click().perform();
		    	    		Thread.sleep(3000);
		    	    		
		    	    		WebElement SubmitDiagnosis = driver.findElement(By.xpath(Locator.Diagnosis_Submit));
		    	    		SubmitDiagnosis.click();
		    	    		Thread.sleep(3000);
		    	    		
		    	    		WebElement ele7 = driver.findElement(By.xpath(Locator.Medication_Name));
		    	    		ele7.sendKeys(MedictionName);
		    	    		Thread.sleep(3000);
		    	    		ele7.sendKeys(Keys.ENTER);
		    	    		Thread.sleep(3000);
		    	    		
		    	    		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		    	    		js.executeScript("window.scrollBy(0,250)", "");
		    	    		Thread.sleep(3000);
		    	    		
		    	    		WebElement ele8 = driver.findElement(By.xpath(Locator.Strength));
	                       ele8.click();
		    	    		ele8.sendKeys(Strength);
		    	    		ele8.sendKeys("2");
		    	    		
	                       Thread.sleep(2000);
	                        
	                       WebElement ele9 = driver.findElement(By.xpath(Locator.Units_Mg));
	                        ele9.clear();
	                       ele9.sendKeys(Units_mg);
	                       // ele9.sendKeys("mg");
	                        
	                        Thread.sleep(2000);
	                        
	                        WebElement ele10 = driver.findElement(By.xpath(Locator.Medication_Amount));
	                        ele10.click();
	                       ele10.sendKeys(Amount);
	                        //ele10.sendKeys("300");
	                        
	                        Thread.sleep(2000);
	                        
	                     WebElement ele11 = driver.findElement(By.xpath(Locator.Units_Tab));
	                      ele11.click();
	                       ele11.sendKeys(Units_tab);
	                     // ele11.sendKeys("Tablet");
	                      
	                      Thread.sleep(2000);
	                        
	                       WebElement ele12 = driver.findElement(By.xpath(Locator.Medication_Frequency));
	                        ele12.click();
	                        ele12.sendKeys(Frequency);
	                        //ele12.sendKeys("one time");
	                        Thread.sleep(2000);
	                        
	                       WebElement ele13 = driver.findElement(By.xpath(Locator.Medication_Duration));
	                        ele13.click();
	                       ele13.sendKeys(Duration);
	                        //ele13.sendKeys("4");
	                        Thread.sleep(2000);
	                        
	                        WebElement ele14 = driver.findElement(By.xpath(Locator.Units_Days));
	                        ele14.click();
	                        ele14.sendKeys(Units_days);
	                       // ele14.sendKeys("weeks");
	                        Thread.sleep(2000);
	                        
	                        WebElement ele15 = driver.findElement(By.xpath(Locator.Medication_Submit));
	                        ele15.click();
	                        Thread.sleep(5000);
	                        
	                        WebElement PresTest = driver.findElement(By.xpath(Locator.Prescribed_test));
	                        PresTest.sendKeys(Prescribed_Test);
	                        //PresTest.sendKeys("WIDAL TEST");
	                        Thread.sleep(2000);
	                        
	                    	List<WebElement> list51 = driver.findElements(By.className(Locator.Prescribed_testname));
	      	      	      for (WebElement listview51 : list51) {
	      	      			if(listview51.getText().trim().equalsIgnoreCase(Prescribed_TestName)) {
	      	      			
	      	      	    	//if(listview51.getText().trim().equalsIgnoreCase("WIDAL TEST (TYPHOID FEVER")) {
	      	      			 Actions actions4 = new Actions(driver);
	      	      			    actions4.moveToElement(listview51);
	      	      			    Thread.sleep(2000);
	      	      				   listview51.click();
	      	      				    Thread.sleep(3000);
	      	      				    break;
	      	      			}
	      	      	      }
	                        
	      	      	      WebElement AddTest = driver.findElement(By.xpath(Locator.Add_test));
	      	      	      AddTest.click();
	      	      	      Thread.sleep(2000);
	      	      	      
	                   
	                        JavascriptExecutor js4 = (JavascriptExecutor) driver;
	                		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	                		
	                		Thread.sleep(2000);
	                		
	                		
	                      WebElement Followupdate = driver.findElement(By.xpath(Locator.Followup_date));
	                     Followupdate.click();
	                   	 Thread.sleep(2000);
	                   	 
	                   	 WebElement SelectYear1 = driver.findElement(By.xpath(Locator.Year_range));
	                        SelectYear1.click();
	                        Thread.sleep(2000);
	                        
	                       
	                     List<WebElement> list41 = driver.findElements(By.className(Locator.Select_year));
	                        for (WebElement listview41 : list41) {
	                			//System.out.println(listview41.getText());
	                       if(listview41.getText().trim().equals(SelectYear)) {
	                        	//if(listview41.getText().trim().equals("2022")) {
	                        		 Actions actions5 = new Actions(driver);
	                 			   actions5.moveToElement(listview41);
	                 			   Thread.sleep(1000);
	                 				   listview41.click();
	                 				   break;
	                        	}
	                        }
	                				   
	                        	Thread.sleep(2000);
	                        List<WebElement> list42 = driver.findElements(By.className(Locator.Select_month));
	                        for (WebElement listview42 : list42) {
	                			//System.out.println(listview42.getText());
	                       if(listview42.getText().trim().equals(SelectMonth)) {
	                        	
	                        	//if(listview42.getText().trim().equals("MAR")) {
	                        		 Actions actions6 = new Actions(driver);
	                 			   actions6.moveToElement(listview42);
	                 			   Thread.sleep(1000);
	                 				   listview42.click();
	                 				   break;
	                        	}
	                        }	
	                       
	                        
	                        Thread.sleep(2000);
	                        List<WebElement> list43 = driver.findElements(By.className(Locator.Select_day));
	                        for (WebElement listview43 : list43) {
	                			//System.out.println(listview43.getText());
	                       if(listview43.getText().trim().equals(SelectDay)) {
	                        	
	                        	//if(listview43.getText().trim().equals("15")) {
	                        		 Actions actions7 = new Actions(driver);
	                 			   actions7.moveToElement(listview43);
	                 			   Thread.sleep(1000);
	                 				   listview43.click();
	                 				   break;
	                        	}
	                        }	
	                        
	                        
	                        WebElement FollowupSubmit = driver.findElement(By.xpath(Locator.Followup_submit));
	                        FollowupSubmit.click();
	                        Thread.sleep(3000);
	                        
	                        WebElement SignandSubmit = driver.findElement(By.xpath(Locator.Sign_submit));
	                        SignandSubmit.click();
	                        Thread.sleep(3000);
	             
	                WebElement popupmessage = driver.findElement(By.id(Locator.Accept_message));
	                
	                if(popupmessage.isDisplayed()) {
	                	
	                        popupmessage.click();
	                        Thread.sleep(4000);
	                        System.out.println("PASSED");
	                
	                }
	                
	                else {
	                	
	                	    System.out.println("FAILED");
	                	
	                }
	                
	                break;
	    	        } catch(StaleElementReferenceException e) {
	    	        attempts++;
	    	        e.printStackTrace();
	    	        }
	    	    }
	    	        
	    	        
	    	        }
	    	        
	    	        
			}
	      
			    return false;
			    
			    
	    	    }
}
	      
	    	        
	    	  
	      
	
	      
	