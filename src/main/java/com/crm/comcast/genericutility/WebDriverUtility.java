package com.crm.comcast.genericutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility {
	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

}
