package com.crm.sdet26.opportunity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.comcast.genericutility.FileUtility;
import com.crm.comcast.genericutility.WebDriverUtility;

public class createOpportunity2 {
public static void main(String[] args) throws Throwable
{
	FileUtility fu = new FileUtility();
	WebDriverUtility wu = new WebDriverUtility(); 

	              WebDriver driver=null;


	if(fu.getPropertyKeyValue("browser").equals("chrome")) {
		           driver=new ChromeDriver();
	}
	else if(fu.getPropertyKeyValue("browser").equals("firefox")) {
	     driver=new FirefoxDriver();	
	}

	wu.waitForPageToLoad(driver);
	driver.get(fu.getPropertyKeyValue("url"));
driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("admin");
driver.findElement(By.id("submitButton")).click();
driver.findElement(By.name("potentialname")).sendKeys("admin");
driver.findElement(By.id("related_to_display"));
driver.findElement(By.name("assigned_user_id")).sendKeys("admin");
driver.findElement(By.name("closingdate")).sendKeys("admin");
driver.findElement(By.name("sales_stage")).sendKeys("admin");

String actualOpportunity=driver.findElement(By.cssSelector("[class='dvHeaderText']")).getText();
String oppName = null;
if(actualOpportunity.contains(oppName))
{
 System.out.println(oppName + "Opportunity created==pass");
}
else
{
 System.out.println(oppName + "Opportunity created==fail");
}
}
}







