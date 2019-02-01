package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void loginAsbankManager() throws InterruptedException {
		log.debug("Login test");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		Thread.sleep(3000);
		Assert.assertTrue(isElementpresent(By.cssSelector(OR.getProperty("addCustbtn"))), "login not succesfull");
		System.setProperty("org.uncommons.reportng.escape-output","false");
		log.debug("log sucessfully executed");
		Reporter.log("log sucessfully executed");
		Reporter.log("<a target=\"blank\" href=\"C:\\Users\\NipunSharma\\Pictures\\albums\\april2016\\img006_26628216905_o.jpg\">Screenshot</a>");
		
	}

}
