package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
	@Given("I am to able to navigate onto the login page")
	public void i_am_to_able_to_navigate_onto_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ChaithraNK\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	@When("I Enter the username as {string}")
	public void i_enter_the_username_as(String string) {
		driver.findElement(By.id("txtUsername")).sendKeys(string);
	}
	@When("I enter the Password as {string}")
	public void i_enter_the_password_as(String string) {
		driver.findElement(By.id("txtPassword")).sendKeys(string);
	}
	@When("I click on the Login button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) throws InterruptedException {
		String name = driver.findElement(By.id("welcome")).getText();
		String ActualData = string;
		Assert.assertEquals(name,ActualData);
		System.out.println("Login Successfully");
		driver.close();
	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("I should see a Error message as {string}")
	public void i_should_see_a_error_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    String actualerr = driver.findElement(By.id("spanMessage")).getText();
	    String Expectederr = "Invalid credentials";
	    Assert.assertEquals(actualerr, Expectederr);
	    driver.close();
	}



}
