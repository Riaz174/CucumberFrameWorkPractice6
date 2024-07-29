package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Capstone.CucumberFrameWork6.protrainingPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class JoinUsForm {
	public WebDriver driver;
	protrainingPage ob = new protrainingPage(driver);
	@Before
	public void setup() throws InterruptedException {
		String Path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Path+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://protrainingtech.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
	}
	@Given("^Already opened the site protrainingtech\\.com$")
	public void already_opened_the_site_protrainingtech_com() throws Throwable {
		String id = driver.getCurrentUrl();
		Assert.assertEquals(id, "https://protrainingtech.com/");
		Thread.sleep(3000);
		
	}

	@When("^User clicks the contact link$")
	public void user_clicks_the_contact_link() throws Throwable {
		protrainingPage ob = new protrainingPage(driver);
		ob.contactClick();
		Thread.sleep(6000);
		
	    }

	@Then("^User able to see Join us form$")
	public void user_able_to_see_Join_us_form() throws Throwable {
		protrainingPage ob = new protrainingPage(driver);
		WebElement joinusText = ob.joinusClick();
		String joinElement  = joinusText.getText();
		System.out.println(joinElement);
		Thread.sleep(6000);
	    }

	@When("^User enters the value of first name \"([^\"]*)\"$")
	public void user_enters_the_value_of_first_name(String arg1) throws Throwable {
		protrainingPage ob = new protrainingPage(driver);
		ob.fname(arg1);
		Thread.sleep(6000);
	    }

	@When("^User enters the value of last name \"([^\"]*)\"$")
	public void user_enters_the_value_of_last_name(String arg1) throws Throwable {
		protrainingPage ob = new protrainingPage(driver);
		ob.lname(arg1);
		Thread.sleep(6000);
	    }

	@When("^User enters the value of email \"([^\"]*)\"$")
	public void user_enters_the_value_of_email(String arg1) throws Throwable {
		protrainingPage ob = new protrainingPage(driver);
		ob.email(arg1);
	    }

	@When("^User enters the phone \"([^\"]*)\"$")
	public void user_enters_the_phone(String arg1) throws Throwable {
		protrainingPage ob = new protrainingPage(driver);
		ob.phone(arg1);
	    }

	@When("^User clicks the register button$")
	public void user_clicks_the_register_button() throws Throwable {
		protrainingPage ob = new protrainingPage(driver);
		ob.register();
	    }

	@Then("^User able to see confirmation message$")
	public void user_able_to_see_confirmation_message() throws Throwable {
		protrainingPage ob = new protrainingPage(driver);
		Thread.sleep(10000);
		WebElement Confirm = ob.confirm();
		String dt =Confirm.getText();
		System.out.println(dt);
		
	    }


}
