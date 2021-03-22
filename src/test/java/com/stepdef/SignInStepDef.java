package com.stepdef;

import org.openqa.selenium.By;

import com.common.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInStepDef extends Base{
	
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		driver = getdriver();
		
	    
	    
	}

	@When("^I click on back arrow$")
	public void i_click_on_back_arrow() throws Throwable {
		//driver.navigate().back();
	    
	    
	}

	@When("^I click on forward arrow$")
	public void i_click_on_forward_arrow() throws Throwable {
		//driver.navigate().forward();
	    
	    
	}

	@When("^I click on refresh arrow$")
	public void i_click_on_refresh_arrow() throws Throwable {
	    //driver.navigate().refresh();
	    
	}

	@When("^I enter text on search box$")
	public void i_enter_text_on_search_box() throws Throwable {
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("cristiano ronaldo");
	    
	    
	}

	@When("^I click on google search$")
	public void i_click_on_google_search() throws Throwable {
		driver.findElement(By.xpath("//button[@class='Tg7LZd gsfi fmcmS']")).click();
	    
	    
	}

	@When("^I click on images$")
	public void i_click_on_images() throws Throwable {
		driver.findElement(By.xpath("(//a[@class='q qs'])[1]")).click();
	    
	    
	}

	@Then("^I successfully get the page$")
	public void i_successfully_get_the_page() throws Throwable {
	    
	    
	}

}
