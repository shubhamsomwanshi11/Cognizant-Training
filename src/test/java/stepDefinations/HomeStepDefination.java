package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Hooks.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeStepDefination {
	WebDriver driver = BaseClass.driver;

	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
	 
	}

	@When("the user clicks on the MEN collection")
	public void the_user_clicks_on_the_men_collection() {
	    new HomePage(driver).clickMensCollection();
	}

	@Then("the MEN collection page should load successfully")
	public void the_men_collection_page_should_load_successfully() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("/collections/men"), "MEN collection did not load correctly.");
	}

	@When("the user clicks on the WOMEN collection")
	public void the_user_clicks_on_the_women_collection() {
	    new HomePage(driver).clickWomenCollection();
	}

	@Then("the WOMEN collection page should load successfully")
	public void the_women_collection_page_should_load_successfully() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("/collections/women"), "WOMEN collection did not load correctly.");
	}

	@When("the user clicks on the KIDS collection")
	public void the_user_clicks_on_the_kids_collection() {
	    new HomePage(driver).clickKidsCollection();
	}

	@Then("the KIDS collection page should load successfully")
	public void the_kids_collection_page_should_load_successfully() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("/collections/kids"), "KIDS collection did not load correctly.");
	}

	@When("the user clicks on the FOOTWARE collection")
	public void the_user_clicks_on_the_footware_collection() {
	    new HomePage(driver).clickFootwareCollection();
	}

	@Then("the FOOTWARE collection page should load successfully")
	public void the_footware_collection_page_should_load_successfully() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("/collections/footware") || driver.getCurrentUrl().contains("/collections/footwear"), "FOOTWARE collection did not load correctly.");
	}
}
