package Capstone.CucumberFrameWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class protrainingPage {
	public WebDriver driver;

	@FindBy(linkText = "Contact") WebElement contactclick;
	@FindBy(xpath = "//*[contains(text(),'Join us !')]") WebElement joinusText;
	@FindBy(id = "form-field-name") WebElement fnameField;
	@FindBy(id = "form-field-field_6c5f814") WebElement lnameField;
	@FindBy(id = "form-field-email") WebElement emailField;
	@FindBy(xpath = "//*[contains(text(),'SDET Selenium')]") WebElement SDETField;
	@FindBy(name = "form_fields[field_694d8a5]") WebElement phoneField;
	@FindBy(xpath = "//*[contains(text(),'REGISTER')]") WebElement registerClick;
	@FindBy(xpath = "//div[@class='elementor-message elementor-message-success']") WebElement confirmation;
	public protrainingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void contactClick() {
		contactclick.click();
	}
	public WebElement joinusClick() {
		return joinusText;
	}
	public void fname(String name) {
		fnameField.sendKeys(name);
	}
	public void lname(String name) {
		lnameField.sendKeys(name);
	}
	public void email(String name) {
		emailField.sendKeys(name);
	}
	public void sdet() {
		SDETField.click();
	}
	public void phone(String name) {
		phoneField.sendKeys(name);
	}
	public void register() {
		registerClick.click();
	}
	public WebElement confirm() {
		return confirmation;
		
	}
	}

	


