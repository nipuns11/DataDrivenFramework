package com.w2a.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddCustomerTest {
	@Test(dataProvider="getData")
	public void addCustomer(String firstName,String lastName, String postCode)
	{
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
	}
}
