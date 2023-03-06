package com.training.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.salesforce.pages.homepages.HomePage;
import com.salesforce.pages.loginpages.LoginPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsPOM {
	WebDriver driver;
	LoginPage login;
	HomePage home;
	
	@Before(order=0)
	public void setUp1(){

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Before(order =1)
	public void setUp2() {
		driver.manage().window().maximize();
	}
	@Given("user open salesforce application")
	public void user_open_salesforce_application() {
	driver.get("https://login.salesforce.com/");
	}

	@When("user on {string}")
	public void user_on(String page) {
	    if (page.equalsIgnoreCase("loginPage"))
	    	login =new LoginPage(driver);
	    else if (page.equalsIgnoreCase("homepage"))
	    	home =new HomePage(driver)	;    
	}

	@When("click on the login button")
	public void click_on_the_login_button1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify page title as {string}")
	public void verify_page_title_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("click on the login button")
	public void click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("alert is present with the text\"Error\"")
	public void alert_is_present_with_the_text_error() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
