package com.crm.sdet26.opportunity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.comcast.genericutility.FileUtility;
import com.crm.comcast.genericutility.WebDriverUtility;

public class createOpportunityWithMapingOfExistingContact {
public static void main(String[] args) throws Throwable {
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
	driver.findElement(By.linkText("Opportunities")).click();
	driver.findElement(By.cssSelector("img[src='themes/softed/images/btnL3Add.gif']"));
	driver.findElement(By.id("mouseArea_Opportunity Name"));
	driver.findElement(By.linkText("reiudkuher")).click();
	driver.findElement(By.className("dvtCellLabel"));
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

	
	




