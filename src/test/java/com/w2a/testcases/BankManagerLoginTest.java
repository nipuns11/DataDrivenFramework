package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void loginAsbankManager() throws InterruptedException {
		log.debug("Login test");
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		Thread.sleep(3000);
		Assert.assertTrue(isElementpresent(By.cssSelector(OR.getProperty("addCustbtn"))), "login not succesfull");

		log.debug("log sucessfull");
	}

}
