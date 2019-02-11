package com.w2a.rough;

import java.util.Date;

public class TimeStamp {
	
	public static void main(String[]args) {
		Date d= new Date();
		String screenshotName = d.toString().replaceAll(":", "_").replaceAll(" ", "_");
		System.out.println(screenshotName);
		System.out.println(d);
	}

}
