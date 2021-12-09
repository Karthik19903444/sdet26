package com.crm.sdet26.opportunity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.comcast.genericutility.FileUtility;
import com.crm.comcast.genericutility.WebDriverUtility;

public class CreateOpportunity {
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
driver.findElement(By.id("submitButton")).click();
driver.findElement(By.linkText("Opportunities")).click();
driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();
driver.findElement(By.id("mouseArea_Opportunity Name")).click();
driver.findElement(By.linkText("reiudkuher")).click();
driver.findElement(By.className("dvtCellInfo"));
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
driver.findElement(By.linkText("Sign Out")).click();
}
}
