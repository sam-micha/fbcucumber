package com.facebooklogin.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class fbloginpage {
	
	WebDriver driver;
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
				
	}
	    

	@Given("Open the facebook application")
	public void open_the_facebook_application() {
		driver.get("https://www.facebook.com/");
	}
	    

	@When("Enter the username and password")
	public void enter_the_username_and_password() {
		WebElement user= driver.findElement(By.id("email"));
		user.sendKeys("r.sammicha@gmail.com");
		WebElement pass= driver.findElement(By.id("pass"));
		pass.sendKeys("123r4qwertY");
		
		   
	}

	@When("Click the login button")
	public void click_the_login_button() {
		WebElement btnLogin= driver.findElement(By.id("login"));
		btnLogin.click();
	    
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		
	    
	}

	@Then("close the browser")
	public void close_the_browser() {
	    
	}


}
