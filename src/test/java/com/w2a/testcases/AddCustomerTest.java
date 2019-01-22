package com.w2a.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class AddCustomerTest extends TestBase {

	@Test(dataProvider = "getData")
	public void addCustomer(String firstName, String lastName, String postCode, String alerttext)
			throws InterruptedException {
		driver.findElement(By.cssSelector(OR.getProperty("addCustbtn"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("firstName"))).sendKeys(firstName);
		driver.findElement(By.cssSelector(OR.getProperty("lastName"))).sendKeys(lastName);
		driver.findElement(By.cssSelector(OR.getProperty("postCode"))).sendKeys(postCode);
		driver.findElement(By.cssSelector(OR.getProperty("addBtn"))).click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(alerttext));

		alert.accept();

	}

	@DataProvider
	public Object[][] getData() {
		String sheetName = "AddCustomerTest";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][cols];

		for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2
			// start reading data from row 2

			for (int colNum = 0; colNum < cols; colNum++) {

				// data[0][0]

				data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		return data;
	}

}
