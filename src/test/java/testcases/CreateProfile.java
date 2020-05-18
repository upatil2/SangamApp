package testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basepackege.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;

public class CreateProfile extends base {
    
	@Test
	public static void Create_Profile_For_Friend() throws IOException, InterruptedException {
		System.out.println("Create profile");
		AndroidDriver<AndroidElement> driver=capabilities("sangamApp");
		

		HomePage homepage=new HomePage(driver);
	    System.out.println(homepage.getCreate_profile());
	    homepage.getCreate_profile().click();
	    Thread.sleep(1000);
	    homepage.getFriend_optionforPFC().click();
		homepage.getFemaleradiobutton().click();
		
		Thread.sleep(1000);
	
		
		homepage.getDOB().get(0).sendKeys("1");
		homepage.getDOB().get(1).sendKeys("5");
		homepage.getDOB().get(2).sendKeys("0");
		homepage.getDOB().get(3).sendKeys("8");
		homepage.getDOB().get(4).sendKeys("1");
		homepage.getDOB().get(5).sendKeys("9");
		homepage.getDOB().get(6).sendKeys("9");
		homepage.getDOB().get(7).sendKeys("5");
		driver.hideKeyboard();
		Thread.sleep(1000);
		homepage.getMother_tongue().click();
		driver.hideKeyboard();
		Thread.sleep(1000);
		homepage.getGujarati_optn_for_MT().click();
		Thread.sleep(1000);
		homepage.getCommunity().click();
		
		Thread.sleep(2000);
		homepage.getHa_optn_for_community().click();
		driver.hideKeyboard();
		Thread.sleep(1000);
		homepage.getLets_bigin().click();
		homepage.getEmail().isDisplayed();
	
	}

}
