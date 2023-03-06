package com.salesforce.pages.homepages;

import org.openqa.selenium.WebDriver;

import com.salesforce.base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public String getTitleOfTheHomePage() {
		String title = getTitleOfThePage();
		System.out.println("title of the page"+title);
		return title;
	}
	private String getTitleOfThePage() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
