package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	public HomePage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//android.view.View[@text='Date of Birth']/following-sibling::*[@class='android.widget.EditText']")
	private List<AndroidElement> DOB;

	@AndroidFindBy(xpath="//android.widget.Button[contains(@text, 'Mother Tongue')]")
	private WebElement mother_tongue;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Gujarati ']")
	private WebElement gujarati_optn_for_MT;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Hindu - Agarwal ']")
	private WebElement ha_optn_for_community;
	
	@AndroidFindBy(xpath="//android.widget.Button[contains(@text, 'Community')]")
	private WebElement community;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Lets Begin ']")
	private WebElement lets_bigin;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Email']")
	private WebElement email;	
	
	@AndroidFindBy(xpath="//android.view.View[@text='Create Profile for']")
	private WebElement create_profile;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Female']")
	private WebElement femaleradiobutton;
	
	@AndroidFindBy(xpath="//android.view.View[@text='Friend ']")
	private WebElement friend_optionforPFC;

	public WebElement getCreate_profile() {
		return create_profile;
	}

	public WebElement getFemaleradiobutton() {
		return femaleradiobutton;
	}

	
	public WebElement getFriend_optionforPFC() {
		return friend_optionforPFC;
	}

	public WebElement getMother_tongue() {
		return mother_tongue;
	}

	public WebElement getGujarati_optn_for_MT() {
		return gujarati_optn_for_MT;
	}

	public WebElement getHa_optn_for_community() {
		return ha_optn_for_community;
	}

	public WebElement getCommunity() {
		return community;
	}

	public WebElement getLets_bigin() {
		return lets_bigin;
	}

	public WebElement getEmail() {
		return email;
	}

	public List<AndroidElement> getDOB() {
		return DOB;
	}

	
	
}
